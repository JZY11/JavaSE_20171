package java1702.javase.newoop;

import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/8.
 * JavaSE_20171.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        System.out.println(strings.add("hello"));
        System.out.println(strings.add("hey"));
        System.out.println(strings.get(1));
        System.out.println(strings.size());
        System.out.println(strings.capacity());
        strings.clear();
        System.out.println(strings);
    }
}
class _Vector{
    public static void main(String[] args) {//初始化向量的容量及容量的增量
        Vector<String> strings = new Vector<>(4, 2);
        strings.add("hello");
        strings.add("hey");
        strings.add("hi");
        strings.add("world");
        strings.add("wow");
        System.out.println(strings.get(3));
        System.out.println(strings.size());
        System.out.println(strings.capacity());
    }
}
