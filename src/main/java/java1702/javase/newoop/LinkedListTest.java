package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        System.out.println(list.size());
        System.out.println(list.get(0));
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.getFirst());
    }
}
