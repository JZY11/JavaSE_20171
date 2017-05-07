package java1702.javase.collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/29.
 * JavaSE_20171.
 */
/*
    哈希表(Hashtable)以键值对的形式存在，泛型，取出元素的方式与Vector，ArrayList不一样，
    他们是通过索引来取得相应的值，而哈希表是通过键来取得值
 */
//       put get size iter keySet values entrySet remove put

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(2, "hello");
        hashtable.put(3, "hello");
        hashtable.put(3, "hi");//键是唯一的不能为空null，值为空不报编译错误，但运行会空指针异常
        System.out.println("size:" + hashtable.size());
        System.out.println(hashtable.get(2));
        System.out.println(hashtable.contains("hi"));
//        hashtable.remove(1);
        System.out.println(hashtable.size());
        for (Integer integer : hashtable.keySet()) {//iter增强for循环  get方法中：设置   现在：集合
            System.out.println(integer + "-->" + hashtable.get(integer));
        }
        for (String s : hashtable.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "-->" + integerStringEntry.getValue());
        }


    }
}
