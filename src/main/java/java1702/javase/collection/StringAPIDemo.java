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
        for (int i = 0; i < c.length; i++) {// 循环输出
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
