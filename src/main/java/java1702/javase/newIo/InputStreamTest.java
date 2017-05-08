package java1702.javase.newIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("C:/Users/Tony.Jaa/Desktop/11.txt");
//            System.out.println(inputStream.read());//输出字符h对应的ascii值
//            System.out.println(inputStream.read());//输出字符e对应的ascii值
//            System.out.println(inputStream.read());//输出字符l对应的ascii值
//            System.out.println((char) inputStream.read());//char范围：【0， 65535】
//            System.out.println((char)inputStream.read());
//            System.out.println((char)inputStream.read());//输出为强制转换成的字符
            int i;
            while ((i = inputStream.read())!= -1){//循环结束条件  read()返回的是字节
                System.out.println((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
