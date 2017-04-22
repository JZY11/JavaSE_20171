package java1702.javase.test;

import java.io.FileNotFoundException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/22.
 * JavaSE_20171.
 */
/*
      编写一个没有处理的发生数组下标越界异常的程序
 */
public class E11 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println((new int[]{1,2,3})[-1]);
    }
}
