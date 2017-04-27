package java1702.javase.io;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/21.
 * JavaSE_20171.
 */
public class FileTest {
    // File类  文件(包括文件和目录) 文件和目录路径名的抽象表示形式
    public static void main(String[] args) {
        File file = new File("raf");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());//false (当前不是目录)
        System.out.println(file.canRead());// 是否可读
        System.out.println(file.canWrite());// 是否可写
        try{
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
//        file.delete();
//        file.deleteOnExit();

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());// raf
        System.out.println(file.getParent());// 返回上一层的路径
        System.out.println(file.getParentFile());


    }
}
