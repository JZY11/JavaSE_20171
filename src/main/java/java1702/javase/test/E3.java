package java1702.javase.test;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/1.
 * JavaSE_20171.
 */
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string:");
        String string = scanner.nextLine();

        char[] chars = string.toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (char aChar : chars) {
            if (aChar == a) {
                a++;
            } else if(aChar == b){
                b++;
            }else if (aChar == c){
                c++;
            }else if (aChar == d){
                d++;
            }else if (aChar == e){
                e++;
            }
        }
        System.out.println("a" + (a));
        System.out.println("b" + (b));
        System.out.println("c" + (c));
        System.out.println("d" + (c));
        System.out.println("e" + (c));
    }
}
