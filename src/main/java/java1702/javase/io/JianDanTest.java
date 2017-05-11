package java1702.javase.io;

import java.io.*;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
          多线程        下载多页图片
      url.openStream()返回结果是一个InputStream
 */
public class JianDanTest implements Runnable {
    //    private static int counter = 0;
    private static final String PAGE_URL = "http://jandan.net/tag/%E5%A4%A9%E6%96%87/page/";
    private int page;

    private JianDanTest(int page) {//有参的构造方法  创建类JianDanTest的实例做为线程构造方法的参数存在，所有要初始化，则定义一个构造方法
        this.page = page;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            Thread thread = new Thread(new JianDanTest(i + 1));//新建18个线程
            thread.start();//线程启动
            System.out.println("page: " + (i + 1));
        }
    }

    @Override
    public void run() {// 每个线程要做的具体事情
        int counter = 0;
        try {
            URL url = new URL(PAGE_URL + page);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))
            ) {//构建出BufferedReader
                String line;
                while ((line = reader.readLine()) != null) {//reader负责读网页源代码的每一行
                    if (line.contains("data-original")) {// 读取到某行中含有data-original，说明这一行有图片的链接地址
                        String imageUrl = line.substring(line.indexOf("data-original=\"") + "data-original=\"".length(), line.indexOf("\" width"));
                              //将含有data-original这一行的源码做字符串的截取，来得到图片的链接
                        if (!imageUrl.startsWith("http")) {//做一判断，开头没有http的加上(http:)
                            imageUrl = "http:" + imageUrl;
                        }
                        String extension = imageUrl.substring(imageUrl.lastIndexOf("."));
                        download(imageUrl, extension, page, ++counter);

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void download(String imageUrl, String extension, int page, int counter) {
        try {
            URL url = new URL(imageUrl);
            try (
                    BufferedInputStream in = new BufferedInputStream(url.openStream());
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("images/" + page + "-" + counter + extension)))
            {
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
                System.out.println("\t" + page + "-" + counter);
            } catch (ConnectException e) {
                System.out.println("timeout...");
                //                download(imageUrl, extension);
                System.out.println(imageUrl);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
