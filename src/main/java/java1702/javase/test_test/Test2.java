package java1702.javase.test_test;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/8.
 * JavaSE_20171.
 */
public class Test2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 0, 0, 6, 6, 5, 4, 7, 6, 7, 0, 5};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[j] = a[i];
                j++;
                System.out.print(b[j] + " ");
            }
        }
    }
}
