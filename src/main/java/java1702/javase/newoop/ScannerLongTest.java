package java1702.javase.newoop;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/9.
 * JavaSE_20171.
 */
public class ScannerLongTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()){//  判断是否还有下一个long型整数
            System.out.println("键盘输入的内容是：" + sc.nextLong());
        }
    }
}
