package java1702.javase.newIo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
/*
     URL    这个类里有一个openStream()方法，返回一个inputStream流
            可以读这个输入流里的所有的数据以字节的形式，再把它写入一个本地的文件即可完成一张图片的下载
 */
public class Download {
    private static final String IMAGE_URL = "http://s1.cn.bing.net/th?id=OJ.WQV64AmdYS8GLw&pid=MSNJVFeeds";

    public static void main(String[] args) {
        try {
            URL url = new URL(IMAGE_URL);
            try (
                    InputStream inputStream = url.openStream();
                    OutputStream outputStream = new FileOutputStream("test.png")
            ) {
                System.out.println(inputStream.available());
                int i;
                while ((i =inputStream.read()) != -1){
                    outputStream.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
