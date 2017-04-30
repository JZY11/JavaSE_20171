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
        String[] strings = s.split(",");
        System.out.println(Arrays.toString(strings));


        System.out.println("以下转int型数组");
//        int[] ints = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();

        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            ints[i] = Integer.parseInt(string);// 对每个元素赋值加转换
        }
            System.out.println(Arrays.toString(ints));
    }
}
