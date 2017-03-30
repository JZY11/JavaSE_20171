package java1702.javase.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/29.
 * JavaSE_20171.
 */
//    Vector(向量)/ add（增加）； get（查询任何索引处的值；） iter size(几个) ；capacity（容量）； setElementAt set（修改）； remove（按照索引删除，返回的为之前删除的元素） clear（清除）
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
        System.out.println("---------------------");


        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(10);
        integers.add(100);
//        System.out.println(integers.size());
//        System.out.println(integers.capacity());
        integers.setElementAt(9,0);
        integers.setElementAt(99,1);
        integers.setElementAt(999,2);
//        System.out.println("->" + integers.set(2, 999));
//        integers.remove(0);
//        integers.clear();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println("---------------------");


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
