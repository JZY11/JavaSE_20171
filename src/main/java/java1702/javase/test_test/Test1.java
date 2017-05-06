package java1702.javase.test_test;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/8.
 * JavaSE_20171.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入");
        java.lang.String s = scanner.nextLine();
        byte[] bytes = s.getBytes();
        int sum = 0;
        for (int i = 0; i < bytes.length; i++) {
            byte aByte = bytes[i];
            sum += bytes[i];
        }
        System.out.println(sum);
    }
}
