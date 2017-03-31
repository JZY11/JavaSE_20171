package java1702.javase.collection;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/31.
 * JavaSE_20171.
 */
public class ArrayList {
    public static void main(String[] args) {
        List<String> strings = new java.util.ArrayList<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("hey");
        System.out.println(strings.size());
        System.out.println(strings.get(2));
        System.out.println(strings.remove(1));//remove有返回值

    }
}
