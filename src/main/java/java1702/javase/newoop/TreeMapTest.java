package java1702.javase.newoop;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/12.
 * JavaSE_20171.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "a");
        map.put(12, "ab");
        map.put(123, "cde");
        System.out.println(map.size());
        System.out.println(map.get(123));
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "--->" + integerStringEntry.getValue());
        }
    }
}
