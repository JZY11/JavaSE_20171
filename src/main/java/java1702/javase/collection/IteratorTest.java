package java1702.javase.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/2.
 * JavaSE_20171.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        //获取books集合对应的迭代器
        Iterator it = books.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            //it.next()方法返回的为Object类型，因此需要进行强制类型转换
//            String book = (String)it.next();
            System.out.println(next);
            if(books.equals("疯狂Java讲义")){
                it.remove();
//                System.out.println(next);
            }
//            book = "测试字符串";
        }
        System.out.println(books);//默认调用了toString方法
    }
}
