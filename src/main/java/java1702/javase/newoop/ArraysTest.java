package java1702.javase.newoop;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/7.
 * JavaSE_20171.
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 5, 6};
        int[] a2 = new int[]{3, 4, 5, 6};
        System.out.println("a数组和a2数组是否相等：" + Arrays.equals(a, a2));//判断数组a与数组a2是否相等
        int[] b = Arrays.copyOf(a, 6);//通过复制a数组，生成一个b数组
        System.out.println("a数组和b数组是否相等：" + Arrays.equals(a, b));
        System.out.println("b的元素为：" + Arrays.toString(b));
        Arrays.fill(b, 2, 4, 1);//将b数组的第三个元素(包括)到第五个元素(不包括)赋值为1
        System.out.println("b的元素为：" + Arrays.toString(b));
        Arrays.sort(b);//对b数组进行排序
        System.out.println("b数组的元素为：" + Arrays.toString(b));
    }
}
