package java1702.javase.io;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/21.
 * JavaSE_20171.
 */
public class ExtensionNameTest {
    public static void main(String[] args) {
        String s = "123.gif";
        System.out.println(s.substring(s.lastIndexOf('.')));
    }
}
