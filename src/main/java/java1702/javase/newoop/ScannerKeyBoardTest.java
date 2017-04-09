package java1702.javase.newoop;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/9.
 * JavaSE_20171.
 */
/*
    只要把下面代码sc.useDelimiter注释去掉，该程序就会把键盘的每行输入当成一个输入项，不会一空格，Tab空白等作为分割符
 */
public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// System.in代表标准输入，就是键盘输入
        sc.useDelimiter("\n"); //"\n"(新行)转义字符，注释掉后若用户输入的有空格的话就会转行输出
        while (sc.hasNext()){//   判断是否还有下一个输入项
            System.out.println("键盘输入的内容是：" + sc.next());
        }
    }
}
