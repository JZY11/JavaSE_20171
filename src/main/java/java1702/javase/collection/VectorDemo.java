package java1702.javase.collection;

import java.util.List;
import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/5.
 * JavaSE_20171.
 */
public class VectorDemo {
    public static void main(String[] args) {
        List<String> allList = new Vector<>();
        allList.add("Hello");
        allList.add(0, "World");
        allList.add("MLDN");
        allList.add("www.mldn.cn");
        for (int i = 0; i < allList.size(); i++) {
            System.out.print(allList.get(i) + " 、");//通过get方法取出每一个元素
        }
    }
}
