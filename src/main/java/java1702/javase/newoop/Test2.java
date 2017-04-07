package java1702.javase.newoop;

import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/7.
 * JavaSE_20171.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {
                chars[i] = (char) (aChar + 32);
            } if (aChar >= 'a' && aChar <= 'z'){
                chars[i] = (char) (aChar - 32);
            }
        }
        char tem = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = tem;
        System.out.println(String.valueOf(chars));
    }
}
