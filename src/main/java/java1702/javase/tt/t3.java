package java1702.javase.tt;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/30.
 * JavaSE_20171.
 */
/*
   拆分字符串，字符串中含有逗号和数字，对数字排序并输出
   例如：String s0 = "123,45,25,85";
   输出：25 45 85 123
   sort方法
 */
public class t3 {
    public static void main(String[] args) {
        String s = "123,45,25,85,";
        String[] strings = s.split(",");
//        Arrays.sort(strings);// 字符串类型不可以排序
//        System.out.println(Arrays.toString(strings));
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {// 对字符串遍历
            ints[i] = Integer.parseInt(strings[i]);// 往整型数组中传数值
        }
        Arrays.sort(ints);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
//        System.out.println(Arrays.toString(ints));
       
    }
}
