package java1702.javase.test;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/15.
 * JavaSE_20171.
 */
public class Test3 {
    public static void main(String[] args) {
        String s0 = "123,45,25,85";
        String[] strings = s0.split(",");
        System.out.println(Arrays.toString(strings));// 可输出字符数组， Arrays工具类
        int[] a=new int[strings.length];

        for(int i=0;i<a.length;i++)
            a[i]=Integer.parseInt(strings[i]);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int number:a)
            System.out.print(number+" ");

    }
}
