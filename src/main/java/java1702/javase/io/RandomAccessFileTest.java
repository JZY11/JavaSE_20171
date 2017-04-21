package java1702.javase.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/21.
 * JavaSE_20171.
 */
/*
      RandomAccessFile类既可以读数据又可以写数据
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("raf", "rw")) {

            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5);// 指针移至最末尾
            }
            //EOFException   End of File(文件末尾异常)
            randomAccessFile.seek(32L);// pos:0->将指针再次移至最前端0处  若想输出4.0则应为32
                                            // measured in bytes from the beginning of the file
                                            // Double数据一个值占8个字节，若为整型数据，一个值占4个字节
            System.out.println(randomAccessFile.readDouble());//报错(文件末尾异常)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
