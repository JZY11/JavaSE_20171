package java1702.javase.test;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/1.
 * JavaSE_20171.
 */
public class E5 {
    public static void main(String[] args) {
        Integer[] integers ={1, 2, 3, 4, 5, 6};
        for (int i = 0; i < integers.length; i++) {
            int temp = integers[i];
            integers[i] = integers[integers.length - i - 1];
            integers[integers.length - i - 1] = temp;
        }
        System.out.println();
    }
}
