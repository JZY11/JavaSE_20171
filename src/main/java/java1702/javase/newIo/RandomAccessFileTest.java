package java1702.javase.newIo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
/*
     EOFException; End of File(到达文件末尾 )
     RandomAccessFile：这个类里有类似于指针的概念，并且指针是依次往下移的，文件写完后指针在最末尾
                       实现了closeable接口也需要关闭
                       既可以读数据也可以写数据
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("raf", "rw");) {

            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5);
            }
            randomAccessFile.seek(0L);// 指针重回开始除
            randomAccessFile.seek(32L);// double类型一个值占8个字节  而整型占4个字节
            System.out.println(randomAccessFile.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
