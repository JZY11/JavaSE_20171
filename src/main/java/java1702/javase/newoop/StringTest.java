package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/7.
 * JavaSE_20171.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "Hello Hey";
        System.out.println(s.charAt(4));
        System.out.println();
        System.out.println(s.concat("World"));
        System.out.println(s.contains("e"));
        System.out.println(s.equals("Hey"));
        System.out.println(s.indexOf('l'));
        System.out.println(s.isEmpty());
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s.length());
        System.out.println(s.replace('H', 'A'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}
