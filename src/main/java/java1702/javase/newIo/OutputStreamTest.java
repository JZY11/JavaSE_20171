package java1702.javase.newIo;

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
         写文件   四个抽象类都实现了closeable接口，所以每当打开一个资源后都要对其进行关闭
    OutputStream仍然不可写中文，同样是基于字节一个一个的写入
    要想写中文可用Writer
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("new");
            outputStream.write(97);// 97为a的ascii对应值
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
