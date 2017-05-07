package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/7.
 * JavaSE_20171.
 */
/*
    容器类：
    ArrayList内部是靠数组来实现的，而LinkedList就不一样了，内部是由一些节点来构成
    节点与节点之间存在两条线，一条指向前，另一条指向后面的节点，这样就可以从前往后遍历
    又可以从后往前遍历，称为：双向链表
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
