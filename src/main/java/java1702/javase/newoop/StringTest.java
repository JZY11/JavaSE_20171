package java1702.javase.newoop;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/7.
 * JavaSE_20171.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "Hello Hey";
        Double d = 5.0;
        Boolean b = true;


        System.out.println(s.charAt(4));
        System.out.println();
//        System.out.println(s.concat("World"));
        System.out.println(s.contains("e"));
        System.out.println("+=+=+=+=");
        System.out.println(s.equals("Hey"));
        System.out.println(s.endsWith("A"));
        System.out.println(s.equalsIgnoreCase("hello hey"));
        System.out.println("==================");

        System.out.println(Arrays.toString(s.split(" ")));//(一)工具类截成一个字符数组

        char[] chars = s.toCharArray();
        System.out.println(chars);//(二)     (一)与(二)都能达到目的，但(一)更简便
        System.out.println(s.indexOf('l'));
        System.out.println(s.isEmpty());
        System.out.println(s.lastIndexOf('l'));

        System.out.println(s.substring(1, 4));//返回一个新字符串，它是此字符串的一个子字符串。该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符

        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(s.length());
        System.out.println(s.replace('H', 'A'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println("------------->");
        System.out.println(s);
        System.out.println("+-=_=-=-+-=_=-=——=-=_+-=——=-=——=");

//        String str = String.valueOf(s);
//        System.out.println(str);
//        String str1 = String.valueOf(d);
//        System.out.println(str1);
        System.out.println(String.valueOf(b));//返回 boolean 参数的字符串表示形式


        System.out.println(String.valueOf(new char[]{'t', 'e', 's', 't'}));//重要
    }
}
