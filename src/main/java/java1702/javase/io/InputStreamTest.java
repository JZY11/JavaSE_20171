package java1702.javase.io;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/18.
 * JavaSE_20171.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            InputStream inputStream  = new FileInputStream("D:/test.txt");
//            int i = inputStream.read();
            int i;
//            while(i != -1){
////                System.out.println(i);
//                inputStream.read();
//                i = inputStream.read();
//                System.out.print((char)i);
//
//            }
            while ((i = inputStream.read())!= -1){
                System.out.print((char)i);
            }
//            System.out.println(inputStream.read());
//            System.out.println(inputStream.read());
//            System.out.println(inputStream.read());
//            System.out.println((char)inputStream.read());// char[0, 65535]
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
//        System.out.println((int)'H');// H所占字节72而所占字节为：72 + 32 = 104
//        System.out.println((int)'l');

    }
}
