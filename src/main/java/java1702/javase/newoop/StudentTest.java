package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/10.
 * JavaSE_20171.
 */

/**
 * 编写一个学生类，将学生的姓名，年龄，性别分别保存到 HashSet ArrayList Hashtable 中，
 * 并利用迭代器 Iterator 将姓名，年龄，性别打印出来
 */
public class StudentTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("name");
        strings.add("age");
        strings.add("gender");
        Iterator<String> iterator = strings.iterator();
            System.out.println(strings);
//        while (iterator.hasNext()){
//        }

    }
}
