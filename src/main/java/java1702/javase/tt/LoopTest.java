package java1702.javase.tt;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/3.
 * JavaSE_20171.
 */
public class LoopTest {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};// 定义一个整型数组
        for (int i = 0; i < ints.length; i++) {
            if (i != 1) {
                System.out.println(ints[i]);
            }
        }
    }
}
