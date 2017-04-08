package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/7.
 * JavaSE_20171.
 */
public class StringBufferTest {
    private static final String ONE_TWO_THREE = "123";

    public static void main(String[] args) {
//        String s = "hello";
//        StringBuffer stringBuffer = new StringBuffer(s);
//        String s1 = stringBuffer.toString();
        String s = "";
        StringBuffer stringBuffer = new StringBuffer();//无参默认方法构造出来的相当于空字符串
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s += ONE_TWO_THREE;//字符串的拼接
            stringBuffer.append(ONE_TWO_THREE);
        }
        System.out.println(System.currentTimeMillis() - start);
//        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }
}
