package java1702.javase.newoop;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/10.
 * JavaSE_20171.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hello");
        hashtable.put(2, "hi");
        hashtable.put(3,"world");
        hashtable.put(3, "Wow");//  键唯一对应一个值， 在此只是为键3更改了值
        hashtable.put(4, "hi");
//        hashtable.put(null, "haha");
//        hashtable.put(100, null);//   键或者值为null时，虽然编译时不报错但运行时会报错
//        hashtable.clear();
        System.out.println(hashtable.size());
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.remove(2));
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "------>" + hashtable.get(integer));
        }
        for (String s : hashtable.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "--->" + integerStringEntry.getValue());
        }
        //   补充三个方法
        System.out.println(hashtable.toString());
        System.out.println(hashtable.containsKey(4));
        System.out.println(hashtable.containsValue("world")); // JDK 1.2
        System.out.println(hashtable.contains("hi"));// 测试此映射表中存在与注定值关联的键  JDK 1.0

    }
}
