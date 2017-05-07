package java1702.javase.collection;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/7.
 * JavaSE_20171.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        List<String> strings2 = new ArrayList<>();
        strings2.add("a");
        strings2.add("b");
        System.out.println(strings1.equals(strings2));
    }
}
