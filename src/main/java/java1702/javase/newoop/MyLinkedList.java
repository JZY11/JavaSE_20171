package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.size());
        myLinkedList.remove(0);
    }
    public String remove(int index){
        Node node = getNode(index);// 找到要删除的node
        String element = node.element;//  要删除node处的元素element
        Node prev = node.prev;
        Node next = node.next;
        if (prev == null && next == null) {
            node.element = null;
        } else if (prev == null){
            first = next;
            next.prev = null;
            node.next = null;
            node.element = null;
        }
        return element;
    }

    private Node getNode(int index) {
        return null;
    }


    public int size(){
        return size;
    }

    public String get(int index){
        if (index < 0 || index >= size) {
            System.out.println("error");
            System.exit(0);// 程序退出
        }
        Node node = first;//将当前的第一个节点(first)赋值给node
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.element;
    }

    public boolean add(String element) {
        if (first == null) {
            // 先创建一个节点
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            // 先创建一个节点
            Node node = new Node(element, last, null);
            last.next = node;//当前的下一个(last)指向它(node)
            last = node;
        }
        size++;
        return true;
    }

    public String first() {
        return first.element;
    }

    public String last() {
        return last.element;
    }

    private class Node { // MyLinkedList的内部类  node 节点\ [nəʊd]
        String element;
        Node prev; // prev previous 以前的\ ['priːvɪəs]
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}

