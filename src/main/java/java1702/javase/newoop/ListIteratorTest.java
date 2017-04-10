package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/10.
 * JavaSE_20171.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        String[] books = {
                "疯狂Java讲义", "疯狂iOS讲义", "轻量级Java EE企业应用实战"};
        List<String> bookList = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            bookList.add(books[i]);
        }
        ListIterator lit = bookList.listIterator();// listIterrator方法返回一个ListIterator对象
        while (lit.hasNext()){
            System.out.println(lit.next());
            lit.add("------分隔符------");
        }
        System.out.println("========下面反向迭代=======");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
