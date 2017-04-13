package java1702.javase.generic;

import java.util.Date;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/13.
 * JavaSE_20171.
 */
public class Test<T> {
    public static void main(String[] args) {
        Test<Integer> test = new Test<>();
        System.out.println(test.concat(1, 2));// 自动装箱
        Test<Double> test1 = new Test<>();
        System.out.println(test1.concat(1.2, 3.4));
        Test<Date> test2 = new Test<>();
        System.out.println(test2.concat(new Date(), new Date()));
//        System.out.println(test.concat(new System[8], new System[4]));
    }
    public String concat(T x, T y){
        return String.valueOf(x).concat(String.valueOf(y));
    }

}
