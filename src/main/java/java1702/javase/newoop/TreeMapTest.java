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
//        TreeMap<Integer, String> map = new TreeMap<>();
//        map.put(1, "a");
//        map.put(12, "ab");
//        map.put(123, "cde");
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("abc", 10);
        map.put("abcd", 100);
        map.put("b", 1000);
//        System.out.println(map.size());
//        System.out.println(map.get(123));
//        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
//            System.out.println(integerStringEntry.getKey() + "--->" + integerStringEntry.getValue());
//        }
        System.out.println(map.size());
        System.out.println(map.get("abcd"));
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + "--->" + stringIntegerEntry.getValue());
        }
    }
}
