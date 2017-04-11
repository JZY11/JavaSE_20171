package java1702.javase.newoop;

import java.util.TreeSet;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class TreeSetTest {// 按元素值排序
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("d");
        strings.add("c");
        strings.add("b");
        strings.add("a");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
