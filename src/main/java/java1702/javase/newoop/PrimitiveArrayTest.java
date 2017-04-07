package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/7.
 * JavaSE_20171.
 */
public class PrimitiveArrayTest {
    public static void main(String[] args) {
        int[] iArr;//定义一个int[]类型的数组变量
        iArr = new int[5];//动态初始化数组，数组长度为5
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = i + 10;// 采用循环方式为每个数组元素赋值
        System.out.println(iArr[i]);
        }
    }
}
