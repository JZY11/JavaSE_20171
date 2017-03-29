package java1702.javase.collection;

import com.sun.org.apache.xpath.internal.SourceTree;

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
        Vector<String> vector = new Vector<>();//JD5   容器内放入的为字符串类型，也可该为其他数据类型

        vector.add("hi");
        vector.add("hello");
        vector.add("test");
        vector.add("hi");
//        System.out.println(vector.get(0));//取某一个索引对应的值
        System.out.println(vector.size());
        for (String s : vector) {
            System.out.println(s);
        }
        System.out.println(vector.size());
        System.out.println(vector.capacity());

        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(10);
        integers.add(100);
        System.out.println(integers.size());
        System.out.println(integers.capacity());
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
        System.out.println(strings.size());
    }
}
