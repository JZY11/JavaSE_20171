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

        String str = new String(chars);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println("итальянский".toLowerCase());
        System.out.println("итальянский".toUpperCase());

        String s4 = "итальитальянскийитальянскийитальянскийитальянскийитальянскийянскийa";
        System.out.println(s4.charAt(s4.length() - 1));
    }
    private static String toLowerCase(String origin){
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {
                chars[i] += 32; //a - A = 32
            }

        }
        return new String(chars);
    }
    private static String toUpperCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'a' && aChar <= 'z') {
                chars[i] -= 32; // a - A = 32
            }
        }
        return new String(chars);
    }
}
