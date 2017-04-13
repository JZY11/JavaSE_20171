package java1702.javase.generic;

import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/13.
 * JavaSE_20171.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("abc");
        vector.add("123");
        vector.add(true);
        vector.add(456);
        System.out.println(vector.get(3));
    }
}
