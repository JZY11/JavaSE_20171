package java1702.javase.collection;

import com.sun.javafx.image.impl.IntArgb;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/28.
 * JavaSE_20171.
 */
public class StringAPIDemo {
    public static void main(String[] args) {
        String str = "hello";//定义字符串
        char[] c = str.toCharArray(); //将字符串变为字符数组
        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];//  ???
            System.out.print(c[i] + "\t");

        }
    }
}
