package java1702.javase.tt;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/1.
 * JavaSE_20171.
 */
public class ConvertTest {
    public static void main(String[] args) {
        String s = "1,2,3";
        String[] strings = s.split(",");
        System.out.println(Arrays.toString(strings));
    }
}
