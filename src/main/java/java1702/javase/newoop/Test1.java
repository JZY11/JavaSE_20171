package java1702.javase.newoop;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/7.
 * JavaSE_20171.
 */
public class Test1 {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nul = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println("input int:");// ??
                ints[i][j] = scanner.nextInt();
            }

        }
    }
}
