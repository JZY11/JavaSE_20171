package java1702.javase.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/21.
 * JavaSE_20171.
 */
//猜数字    1.生成一个随机整数（10000）  100小了  1000小了 100000大了    10000对了
public class EE1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
    }
}
