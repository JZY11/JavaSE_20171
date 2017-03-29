package java1702.javase.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/29.
 * JavaSE_20171.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("test");
        strings.add("hi");
//        System.out.println(strings.get(0));
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.size());
        System.out.println(strings.capacity());


        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(10);
        integers.add(100);
        System.out.println(integers.size());
        System.out.println(integers.capacity());


        Set<String> strings1 = new HashSet<>();
        strings1.add("a");
        strings1.add("aa");
        strings1.add("aaa");
        System.out.println(strings1.size());
        for (String s : strings1) {
            System.out.println(s);
        }
    }
}
