package java1702.javase.collection;

import java.util.HashSet;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
    Set:元素不可重复
    HashSet:无序  但效率比较高  内部是靠HashMap来实现的 没有get()方法，不可通过该方法取得里面的元素,没有类似于索引的概念
    只有通过遍历(iter)的方式，将里面的元素一个一个的都取出
 */
public class HsshSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("helllo");
        strings.add("hi");
        strings.add("test");
        strings.add("Test");

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
