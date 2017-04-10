package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/10.
 * JavaSE_20171.
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<Object> c = new ArrayList<>();
        c.add("孙悟空");
        c.add(6);
        System.out.println("c的集合的元素个数为：" + c.size());
        System.out.println(c.remove(6));// 删除指定元素
        System.out.println(c.size());
        System.out.println(c.contains("孙悟空"));
        c.add("轻量级Java EE企业应用实战");
        System.out.println("c集合的元素：" + c);
        Collection<String> books = new HashSet<>();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        System.out.println("c集合是否完全包含books集合："+ c.containsAll(books));
        c.removeAll(books);// 用c集合减去books集合里的元素
        System.out.println("c集合的元素：" + c);
//        c.clear();
//        System.out.println("c集合的元素：" + c);
        books.retainAll(c);// 控制books集合里只剩下c集合里也包含的元素  ？？？
        System.out.println("books集合的元素：" + books);// []

    }
}
