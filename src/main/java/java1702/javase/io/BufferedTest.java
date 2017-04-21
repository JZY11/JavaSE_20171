package java1702.javase.io;

import java.io.*;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/21.
 * JavaSE_20171.
 */
public class BufferedTest {
    public static void main(String[] args) {
        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:/Users/Tony.Jaa/Desktop/0420_Download.mov"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/Users/Tony.Jaa/Desktop/new_Download.mov"))
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
