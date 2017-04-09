package java1702.javase.newoop;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/9.
 * JavaSE_20171.
 */
/*
   创建Scanner对象是传入一个file对象作为参数  读取文件输入
 */
public class ScannerFileTest {
    public static void main(String[] args)  throws Exception {// throws Exception表明mian()方法不处理任何异常

        Scanner sc = new Scanner("ScannerKeyBoardTest.java");
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
