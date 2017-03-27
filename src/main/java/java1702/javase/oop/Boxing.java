package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
public class Boxing {
    public static void main(String[] args) {
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("total time:" + (System.currentTimeMillis() - start)/1000);
        System.out.println("sum:" + sum);
    }
}
