package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/28.
 * JavaSE_20171.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "asdf";
        char[] chars = {'H','e', 'l', 'l', 'o'};
        String s2 = new String(chars);
        System.out.println(s2);

        for (char c : s2.toCharArray()) {
        //    System.out.print(c + "\t");
        }
        String s3 = "Hello";
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
    }
}
