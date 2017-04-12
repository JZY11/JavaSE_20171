package java1702.javase.newoop;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/12.
 * JavaSE_20171.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1, "a");
        map.put(100, "bc");
        map.put(100, "def");
        System.out.println( map.size());
        System.out.println(map.get(100));
        for (Integer integer : map.keySet()) {
            System.out.println(integer + "-->" + map.get(integer));
        }
    }
}
