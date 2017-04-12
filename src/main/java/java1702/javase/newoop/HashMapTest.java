package java1702.javase.newoop;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/12.
 * JavaSE_20171.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "bcd");
        map.put(3, "def");
        map.put(null, "jin");//  HasTable的键和值都不允许为空值
        map.put(100, null);//  键重复时会替换原来的值
        map.put(100, "uotur");
        System.out.println(map.size());
        System.out.println(map.get(2));
        for (Integer integer : map.keySet()) {
            System.out.println(integer + "-->" + map.get(integer));
        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() +"-->" +integerStringEntry.getValue());
        }
//        map.clear();
        System.out.println(map.isEmpty());
        System.out.println("===========");
        Set<Integer> integers= map.keySet();
        System.out.println(integers);
        System.out.println("------->");
        Set<Map.Entry<Integer, String>> integers1 = map.entrySet();
        System.out.println(integers1);
        Collection<String> strings = map.values();
        System.out.println(strings);
    }
}
