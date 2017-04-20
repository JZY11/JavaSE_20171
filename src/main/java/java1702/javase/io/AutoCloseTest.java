package java1702.javase.io;

import java.io.*;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/21.
 * JavaSE_20171.
 */
public class AutoCloseTest {
    public static void main(String[] args) {
        try (
                BufferedReader buf = new BufferedReader(new FileReader("ReaderTest.java"));
                PrintStream pri = new PrintStream(new FileOutputStream("test"))
        ) {
            System.out.println(buf.readLine());
            pri.println("你好，世界");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
