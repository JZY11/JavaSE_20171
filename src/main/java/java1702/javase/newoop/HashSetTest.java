package java1702.javase.newoop;

import java.util.HashSet;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class HashSetTest {//  使用 HashMap 存储元素  无序  效率高
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hey");
        strings.add("hi");
        strings.add("hi");
        System.out.println(strings.size());
        for (String string : strings) {//HashSet无get方法，只能遍历输出
            System.out.println(string);
        }
//        strings.clear();
        System.out.println(strings.contains("hello"));
        System.out.println(strings.isEmpty());
        System.out.println(strings.remove("hey"));
        System.out.println("-----------");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
