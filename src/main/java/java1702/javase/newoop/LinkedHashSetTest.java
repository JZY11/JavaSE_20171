package java1702.javase.newoop;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class LinkedHashSetTest {//  按元素添加顺序排序
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("d");
        strings.add("c");
        strings.add("b");
        strings.add("a");
        HashSet<String> strings1 = new HashSet<>();
        strings1.add("hello");
        strings1.add("hey");
        strings1.add("hi");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.isEmpty());
        System.out.println(strings.contains("k"));
        System.out.println(strings.remove("c"));
        System.out.println("===========");
        System.out.println(strings.equals(strings1));
    }
}
