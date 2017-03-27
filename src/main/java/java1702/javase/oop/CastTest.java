package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
public class CastTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        //(a)
        Integer integer = new Integer(x);
        String s1 = integer.toString();//调用无参方法
        System.out.println(s1);

        //(b)
        String s2 = String.valueOf(x);
        System.out.println(s2);

        //(c)
        String s3 = "" + x + y;
        System.out.println(s3);

        //(d)
        String s4 = integer.toString(x);

        //(1)

    }
}
