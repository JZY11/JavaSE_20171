package java1702.javase.collection;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/7.
 * JavaSE_20171.
 */
/*
     ArrayListTest类的equals()方法：时只有当两个列表中的元素相同且顺序相同时才返回true
     ArrayListTest类的subList()方法：截取当前列表，返回一个新列表。谨记：接受时只能用List接受，，不可用ArrayList接受
                                     返回的是一个list列表的view(视图)，而不是一个列表，视图是列表的一个新开窗口
     removeAll()方法：移除strings2中也包含在strings3中的元素，移除共有的
     retainAll()方法：移除strings2中不包含在strings3中的元素,保留共有的
     视图的概念：List<String> strings3 = strings2.subList(1, 3);
                 strings3是strings2的视图，就是二者互相联系，其中一个变化就会引起另一个的变化
                 strings3的存在依赖于strings2
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        List<String> strings2 = new ArrayList<>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("c");
        System.out.println(strings1.equals(strings2));

        List<String> strings3 = strings2.subList(1, 3);
        System.out.println(strings3);
        System.out.println("----------");
        System.out.println(strings2.containsAll(strings1));
        System.out.println(strings3.containsAll(strings1));
        System.out.println("++++++++++++");
        strings2.removeAll(strings3);//移除strings2中也包含在strings3中的元素
        System.out.println(strings2);
        System.out.println("==========");
        strings3.retainAll(strings2);
        System.out.println(strings3);
    }
}
