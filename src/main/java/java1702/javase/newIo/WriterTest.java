package java1702.javase.newIo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
/*
       若手动关闭资源的话(close()),写入到文件内容时要：flush()
       若自动关闭打开的资源时，只需要将try后的花括号改为小括号即可不用写close()和flush()->可自动写入数据
 */
public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("new");
            writer.write(Integer.parseInt("4e00",16));
            writer.write(0x4e01);
            System.out.println(011);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
