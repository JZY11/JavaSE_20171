package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/8.
 * JavaSE_20171.
 */
public class _StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer.append(" world"));
        System.out.println(stringBuffer.delete(5, 6));
        System.out.println(stringBuffer.insert(5," ")); // offset 偏移量
        System.out.println(stringBuffer.insert(stringBuffer.length(), "!"));
        System.out.println(stringBuffer.reverse());
        stringBuffer.setCharAt(0, 'H');
        System.out.println(stringBuffer);
        System.out.println(stringBuffer);
    }
}
