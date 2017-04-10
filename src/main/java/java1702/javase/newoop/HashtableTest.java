package java1702.javase.newoop;

import java.util.Hashtable;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/10.
 * JavaSE_20171.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hello");
        hashtable.put(2, "hi");
        hashtable.put(3,"world");
        System.out.println(hashtable.size());
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.remove(2));
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "------>" + hashtable.get(integer));
        }
    }
}
