package java1702.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
public class WriterTest {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("new1");
            // Unicode编码   用原始的write(放入整型)  需将16进制转换为10进制
            writer.write(Integer.parseInt("4e00",16));//将4e00这个16进制转换为10进制
//            writer.write("中国");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
