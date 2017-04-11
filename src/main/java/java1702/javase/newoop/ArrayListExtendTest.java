package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class ArrayListExtendTest {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        List<String> strings2 = new ArrayList<>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("c");
        System.out.println(strings1.equals(strings2));
        List<String> strings3 = new ArrayList<>(strings2.subList(1, 3));//strings2.subList(1, 3) 为一视图，需要变为一个列表,否则最后一步报错， 将strings2.subList(1, 3)作为()里的参数变为一个列表
        System.out.println(strings3);
        System.out.println(strings2.containsAll(strings3));
        System.out.println(strings1.containsAll(strings3));
        System.out.println("-----------");
        strings2.removeAll(strings3);
        System.out.println(strings2);
        strings3.retainAll(strings2);// [b, c] [a]
        System.out.println(strings3);// null
    }
}
