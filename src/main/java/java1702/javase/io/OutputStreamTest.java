package java1702.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
         写文件
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("new");
            outputStream.write(97);// 97为a的ascii对应值
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
