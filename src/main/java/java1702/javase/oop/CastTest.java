package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
//       整型与字符串的相互转换
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
        String s4 = Integer.toString(x);
        System.out.println(s4);


        String string = "123";

        //(1)
        int y1 = Integer.valueOf(string);
        System.out.println(y1);

        //(2)
        int y2 = Integer.parseInt(string);//parse 解析
        System.out.println(y2);

        //(3)
        int y3 = new Integer(string);//构造方法
        System.out.println(y3);

    }
}
