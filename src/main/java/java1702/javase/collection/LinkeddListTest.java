package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/7.
 * JavaSE_20171.
 */
/*
    容器类：
    ArrayList内部是靠数组来实现的，而LinkedList就不一样了
 */
public class LinkeddListTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.getLast());
        System.out.println(strings.getFirst());
    }
}
