package java1702.javase.test_test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/6.
 * JavaSE_20171.
 */
/*
     编写一个程序，下载 google 首页 logo 图片保存到本地
 */
public class T5 {
    public static void main(String[] args) throws MalformedURLException {
        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("https://www.google.co.jp/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/Users/Tony.Jaa/Desktop/11.png"))
                ) {
            int i;
            while ((i = in.read()) != -1){
                out.write(i);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
