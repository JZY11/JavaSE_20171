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
   Iterator迭代器采用的是快速失败(fail-fast)机制，一旦在迭代过程中检测到集合已经被修改
   (通常是程序中的其他线程修改)，程序立即引发ConcurrentModificationException异常
   而不是显示修改后的结果，这样可以避免共享资源而引发的潜在问题
 */
public class IteratorErrorTest {
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
            String book = (String) it.next();
            System.out.println(book);
            if (book.equals("疯狂Java讲义")) {
                //使用Iterator迭代过程中，不可修改集合元素，下面代码引发异常
                books.remove(book);
            }
//            book = "测试字符串";
// }
            System.out.println(books);//默认调用了toString方法
        }
    }
}
