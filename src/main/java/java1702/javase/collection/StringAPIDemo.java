package java1702.javase.collection;

import com.sun.javafx.image.impl.IntArgb;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/28.
 * JavaSE_20171.
 */
public class StringAPIDemo {
    public static void main(String[] args) {
        // (1)字符串与字符数组的转换
        String str = "hello";//定义字符串
        char[] c = str.toCharArray(); //将字符串变为字符数组
        for (int i = 0; i < 10; i++) {// 循环输出
            char c1 = c[i];//  ???
            System.out.print(c[i] + "\t");
        }
        System.out.println("");// 在控制台输出后换行
        String str1 = new String(c);// 将全部字符数组变为String
        String str2 = new String(c, 0, 3);//将部分字符数组变为String
        System.out.println(str1);
        System.out.println(str2);
    }
}
          //(2)从字符串中取出制定位置的字符
class StringAPIDemo1{
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1.charAt(3));//取出字符串中第四个字符
    }
}
          //(3)字符串与byte数组的转换
class StringAPIDemo2{
    public static void main(String[] args) {
        String str1 = "hello";
        byte[] b = str1.getBytes();//将字符串变为byte数组
        System.out.println(b);
        System.out.println(new String(b));//将全部byte数组变为字符串
        System.out.println(new String(b, 1, 3));//将部分byte数组变为字符串
    }
}
           //(4)取得一个字符串的长度
class StringAPIDemo3{
    public static void main(String[] args) {
        String str1 = "hello LiXingHua";
        System.out.println(str1.length());
    }
}
           //(5)查找一个指定的字符串是否存在
class StringAPIDemo4{
    public static void main(String[] args) {
        String str1 = "abcdefgcgh";
        System.out.println(str1.indexOf("c"));
        System.out.println(str1.indexOf("c", 3));//查到返回位置，从第四个开始查找
        System.out.println(str1.indexOf("x"));

               }
}
             //(6)去掉左右空格
class StringAPIDemo5{
    public static void main(String[] args) {
        String str1 = "     hello    ";
        System.out.println(str1.trim());//去掉左右空格后输出
    }
}
             //(7)字符串截取
class StringAPIDemo6{
    public static void main(String[] args) {
        String str1 = "hello world";
        System.out.println(str1.substring(6));//从第7个位置开始截取
        System.out.println(str1.substring(0, 5));//截取0-5个位置的内容
    }
}
             //(8)按照指定的字符串拆分字符串
class StringAPIDemo7{
    public static void main(String[] args) {
        String str1 = "hello world";
        String[] s = str1.split("");//按空格进行字符串的拆分
        for (int i = 0; i < s.length; i++) {//循环输出
            String s1 = s[i];
            System.out.println(s[i]);

        }
    }
}
             //(9)字符串的大小写转换
class StringAPIDemo8{
    public static void main(String[] args) {
//        String str1 = "hello world";
//        System.out.println(str1.toUpperCase());
        System.out.println("hello world".toUpperCase());
        System.out.println("HELLO WORLD".toLowerCase());
    }
}
class StringAPIDemo9{
    public static void main(String[] args) {
        String str1 = "hello";
        String newStr = str1.replaceAll("l", "x");
        System.out.println(str1.replaceAll("l", "x"));
    }
}

