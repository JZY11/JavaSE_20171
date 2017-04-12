package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/12.
 * JavaSE_20171.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        HashSet<String> set = new HashSet<>();
        set.add("c");
        set.add("b");
        set.add("a");
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2 , "df");
        Iterator<Integer> iterator2 = map.keySet().iterator();// 间接调用iterator方法
        while (iterator2.hasNext()) {
            int k= iterator2.next();
            System.out.println(k + map.get(k));

        }
    }
}
