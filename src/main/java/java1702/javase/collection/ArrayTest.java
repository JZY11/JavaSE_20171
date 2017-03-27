package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[0] = "test...";
        System.out.println(strings[0]);//下标 索引 index

        boolean[] booleans = new boolean[100];
        booleans[0] = false;
        System.out.println(booleans[1]);

       // int[] ints = new int[10000];
        // System.out.println(ints[9999]);

        int[] ints = {1, 2, 3, 4, 5 , 4659,182};
        System.out.println(ints[6]);

        double[] doubles = new double[100];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = i + 1;
        }
           // System.out.println(doubles.length - 1);
        System.out.println(doubles.length);

        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
        //  System.out.println(doubles[9999]);
        System.out.println(doubles.length);//输出数组的长度

        ArrayTest[] arrayTests = {new ArrayTest(), new ArrayTest(), new ArrayTest()};
        //arrayTests[0] = new ArrayTest();
        System.out.println(arrayTests[0]);
        System.out.println(arrayTests[1]);
        System.out.println(arrayTests[2]);
    }
}
