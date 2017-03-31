package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/31.
 * JavaSE_20171.
 */
public class StringCopyTest {
    public static void main(String[] args) {
        int[] srcArray = {1, 2, 3, 4, 5, 6};
        int[] destArray = new int[10];
        // Arrays.toString(): 返回指定数组内容的字符串表示形式(Array为一个类，调用了toString方法)
        System.out.println(Arrays.toString(destArray));//输出一个容量为10的十个0的字符串
        System.arraycopy(srcArray,0, destArray, 0, 1);
        System.out.println(Arrays.toString(destArray));

    }
}
