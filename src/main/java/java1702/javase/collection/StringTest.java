package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/28.
 * JavaSE_20171.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String b = null; // String为引用数据类型可直接复制为null "null"唯一字符串其内容为空
        String s1 = "asdf";//  一直接量的方式定义
        String a = new String();// 标准定义方式(调用无参默认构造方法)定义一个空字符串
        System.out.println();//输出一个空字符串(" ")而不是null

        //  字符数组变为字符串
        char[] chars = {'H','e', 'l', 'l', 'o'};
        String s2 = new String(chars);// (一)
        System.out.print(s2);
        System.out.println("-----------------");

        for (char c : s2.toCharArray()) {// 又变回字符数组
            System.out.println(c + "\t");
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
        String s6 = "GoodBoy";
        System.out.println(toLowerCase(s6));//调用了toLowerCase方法
        System.out.println(toUpperCase(s6));
    }
    private static String toLowerCase(String origin){// 接受参数为原始字符串origin或src
        char[] chars = origin.toCharArray();//先变为字符一维数组  参数调用tolowerCase方法
        for (int i = 0; i < chars.length; i++) {//遍历的过程，遍历每一个字符将大写变为小写
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {// 对字符进行判断
                chars[i] += 32; //a - A = 32
            }

        }
//        String s = new String(chars);
        return new String(chars); //return为字符串
    }
    private static String toUpperCase(String origin) {// String origin 字符串类的对象(origin)所以可以调用字符类的方法toCharArray()，参数也是类的对象
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'a' && aChar <= 'z') {
                chars[i] -= 32; // a - A = 32
            }
        }
        return new String(chars);// 将字符数组再次转换为字符串
    }
}
