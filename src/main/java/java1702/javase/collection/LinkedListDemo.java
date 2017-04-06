package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/5.
 * JavaSE_20171.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //  (一)为链表增加内容
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        link.add("B");
        link.add("C");
        System.out.println("初始化链表：" + link);
        link.addFirst("X");
        link.addLast("Y");
        System.out.println("增加头和尾之后的链表：" + link);
    }
}
     //(二)三种找到链表头的方法
class LinkedListDemo1{
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        link.add("B");
        link.add("C");
        System.out.println("1-1、element()方法找到表头：" + link.element());//只负责找到
        System.out.println("1-2、找完之后链表的内容：" + link);
        System.out.println("2-1、peek()方法找到表头：" + link.peek());//找到不删除表头
        System.out.println("2-2、找完之后链表的内容：" + link);
        System.out.println("3-1、poll()方法找到表头：" + link.poll());//找到并删除表头
        System.out.println("3-2、找完之后链表的内容：" + link);
    }
}
     //(三)以先进先出(FIFO)方式取出内容
class LinkedListDemo2{
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        link.add("C");
        link.add("B");
        System.out.println(link.size());
        for (int i = 0; i < link.size() + 1; i++) {
            System.out.print(link.poll() + "、");
        }
    }
}
