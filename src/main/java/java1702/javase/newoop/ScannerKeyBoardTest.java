package java1702.javase.newoop;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/9.
 * JavaSE_20171.
 */
public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println("键盘输入的内容是：" + sc.next());
        }
    }
}
