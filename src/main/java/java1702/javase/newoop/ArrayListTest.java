package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(list.size());
        System.out.println(list.get(1));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
