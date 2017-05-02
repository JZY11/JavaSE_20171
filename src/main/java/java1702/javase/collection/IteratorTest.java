package java1702.javase.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/2.
 * JavaSE_20171.
 */
/*
   Iterator必须依附于Collection对象，Iterator本身并不提供盛装对象的能力
   如果需要创建Iterator对象，则必须有一个被迭代的对象，没有集合的Iterator仿佛无本之木
   毫无存在意义
   若有一个Iterator对象，则必须有一个与之关联的Collection对象，Iterator提供了两个方法
   来迭代访问Collection集合里的元素，并可通过remove()方法来删除集合上一次next()方法
   返回的集合元素
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
//            Object next = it.next();
            //it.next()方法返回的为Object类型，因此需要进行强制类型转换
            String book = (String)it.next();
            System.out.println(book);
            if(book.equals("疯狂Java讲义")){
                it.remove();// 删除元素
                System.out.println(book);//???
            }
//            book = "测试字符串";
        }
        System.out.println(books);//默认调用了toString方法
    }
}
