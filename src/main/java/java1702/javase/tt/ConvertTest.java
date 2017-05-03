package java1702.javase.tt;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/1.
 * JavaSE_20171.
 */
public class ConvertTest {
    public static void main(String[] args) {
        System.out.println("以下字符串转字符串数组");
        String s = "1,2,3";
        String[] strings = s.split(",");//split方法返回一个字符串数组
                                               // String[]
        System.out.println(Arrays.toString(strings));


        System.out.println("以下转int型数组");
//        int[] ints = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();


        // 转int型数组不可以一步转换，需要循环，先定义一个整型数组长度与字符串数组长度一样
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {// 做一个循环迭代，要用到索引
            String string = strings[i];
            ints[i] = Integer.parseInt(string);// 对每个元素赋值加转换
        }
            System.out.println(Arrays.toString(ints));
    }
}
