package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.List;

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
    }
}
