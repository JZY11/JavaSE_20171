package java1702.javase.newIo;

import java.io.*;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
public class InputStreamOutputStream {
    private static final String PATH = "src/main/java/java1702/javase/newIo/";

    public static void main(String[] args) {
        try (
                InputStream inputStream = new FileInputStream(PATH.concat("InputStreamOutputStream"));
                OutputStream outputStream = new FileOutputStream(PATH.concat("Test.java"))
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {// while括号里里为读取一个字节
                outputStream.write(i);// 为写入一个字节，即可生成新文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
