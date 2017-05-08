package java1702.javase.newIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
       绝对路径：指定在某一个硬盘上的路径，如：C:/Users/Tony.Jaa/Desktop
       相对路径：在当前项目目录下创建的文本文件，扩展名可写可不写，引入时直接写文本文件名即可
                 若有目录名的话：目录名/文本文件名ok(包也是目录结构)
       read()方法：每次都会读取下一个字节
       只有英文是基于字节来构成的，其他语言则不是
       输入，输出是相对于内存而言的
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
//            System.out.println(1 / 0);
            inputStream = new FileInputStream("C:/Users/Tony.Jaa/Desktop/11.txt");
//            System.out.println(inputStream.read());//输出字符h对应的ascii值
//            System.out.println(inputStream.read());//输出字符e对应的ascii值
//            System.out.println(inputStream.read());//输出字符l对应的ascii值
//            System.out.println((char) inputStream.read());//char范围：【0， 65535】
//            System.out.println((char)inputStream.read());
//            System.out.println((char)inputStream.read());//输出为强制转换成的字符
            int i;
            while ((i = inputStream.read()) != -1) {//循环结束条件  read()返回的是字节
                System.out.print((char) i);
                i = inputStream.read();//隔一个读一个
            }
//            System.out.println(1/0);
//            inputStream.close();// 上面报错，所以关闭不了，应将其放在finally里，好处是：不管try语句有没有异常，都可以执行的到
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {

                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
