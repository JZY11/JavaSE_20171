package java1702.javase.exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/18.
 * JavaSE_20171.
 */
/*
  model:""(双引号内没有东西时为非受检异常)|| name:" "(双引号内的文件若是错误的则为受检异常)
  model:" "双引号中若为r的话(只读),name中的文件必须为已经存在的，若为rw(读写)时，即使文件不存在也会自动生成写一个
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("build.gradle","r");
        } catch (FileNotFoundException e) {// 受检异常必须要对其进行处理
            e.printStackTrace();
        }
        System.out.println("test");
//        test();
        // extract method(抽取方法)  Ctrl + Alt + M

//
//        System.out.println("test....");
//        String[] strings = new String[5];
//        for (int i = 0; i < 10; i++) { //非受检异常(bug) 程序员的问题(编写不规范)可修复
//            System.out.println(strings[i]);
//        }
    }
//    private static void test() {
//        System.out.println("input a file name:");
//        Scanner scanner = new Scanner(System.in);
//        String s =scanner.nextLine();// 若文件名输入错误并非是程序员所能控制的为受检异常，必须要处理
//        try {
//            RandomAccessFile randomAccessFile = new RandomAccessFile("","r");// mode:后可加"r", "rw", "rws", or "rwd"中的一种
//        } catch (FileNotFoundException e) {
////            e.printStackTrace();
//            System.out.println("file not found!");// 积极的处理
//            test();// 递归 recursive
//        }
//    }
}
