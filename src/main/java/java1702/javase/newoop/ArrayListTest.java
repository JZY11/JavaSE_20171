package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/10.
 * JavaSE_20171.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hey");
        list.add("hello");
        list.add("hello");
        list.add("hi");
        list.add("Wow");
        System.out.println(list.size());
        System.out.println(list.get(1));
        for (String s : list) {
            System.out.println(s);
        }
//        list.clear();
        System.out.println(list.addAll(list));//  ***
        System.out.println(list.addAll(1, list));// &&
        System.out.println(list.contains("hey"));
        System.out.println(list.indexOf("hi"));//  返回整型int 索引
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf("hello"));
        System.out.println(list.remove("Wow"));
        System.out.println("--------");
        System.out.println(list.subList(2, 3));//  2包括，3不包括(截取成子集合)
        for (Object o : list.toArray()) {// 也可定义一个Object[]数组来接受
            System.out.println(o);
        }
        System.out.println("=============");
        Object[] objects = list.toArray();
        System.out.println(objects);

    }
}
