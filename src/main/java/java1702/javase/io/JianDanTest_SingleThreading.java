package java1702.javase.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/11.
 * JavaSE_20171.
 */
/*
       单线程下载多张图片
 */
public class JianDanTest_SingleThreading {
    private static int counter = 0;
    private static final String PAGE_URL = "http://jandan.net/tag/%E5%A4%A9%E6%96%87/page/";

    public static void main(String[] args) {
        for (int i = 0; i < 22; i++) {
            System.out.println("page:" + (i + 1));
            page(i + 1);
        }
    }

    public static void page(int page) {// 以下代码为读取每页的源代码
        try {
            URL url = new URL(PAGE_URL + page);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("data-original")) {
                    String imageUrl = line.substring(line.indexOf("data-original=\"") + "data-original=\"".length(), line.indexOf("\" width"));
                    if (!imageUrl.startsWith("http")) {
                        imageUrl = "http:" + imageUrl;
                    }
                    String extension = imageUrl.substring(imageUrl.lastIndexOf("."));//获取一扩展名
                    download(imageUrl,extension);//调用download()方法下载这一张图片
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void download(String imageUrl, String extension) {// 以下代码为下载图片过程下载一张图片
        try {
            URL url = new URL(imageUrl);
            try {
                try (
                        BufferedInputStream in = new BufferedInputStream(url.openStream());
                        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("images/" + (++counter) + extension))
                ) {
                    int i;
                    while ((i = in.read()) != -1){
                        out.write(i);
                    }
                    System.out.println("\t" + counter);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

