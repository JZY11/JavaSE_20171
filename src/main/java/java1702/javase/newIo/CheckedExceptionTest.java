package java1702.javase.newIo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
      抽取方法属于重构中的内容(extract method) 快捷键：Ctrl + Alt + M
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
        // 抽取方法属于重构中的内容(extract method) 快捷键：Ctrl + Alt + M
        test();
    }

    private static void test() {
        System.out.println("input a file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName,"rw");//"rw" 连读带写
            randomAccessFile.write(123456);
        } catch (IOException e) {
//            e.printStackTrace();
            // 以下为更加积极的处理方式
            System.err.println("file not found");
            test();// recursive 递归  这一行左端有图案显示
        }
    }
}
