package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = new String[10];
        System.out.println(strings[0]);//下标 索引 index

        boolean[] booleans = new boolean[100];
        System.out.println(booleans[1]);

        int[] ints = new int[10000];
        System.out.println(ints[9999]);

        double[] doubles = new double[10000];
        System.out.println(doubles[9999]);
    }
}
