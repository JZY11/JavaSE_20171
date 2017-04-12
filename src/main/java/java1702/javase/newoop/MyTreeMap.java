package java1702.javase.newoop;

import java.util.TreeMap;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/12.
 * JavaSE_20171.
 */
public class MyTreeMap<k, v> extends TreeMap<k, v> {// 没报错说明父类TreeMap里有无参的默认方法

    /*
        子类重写了父类的put()方法
        键可以为nun-null，值可以为null，重新定义值也不可以为null
     */

    @Override
    public v put(k key, v value) {
        if (value == null) {
            throw new NullPointerException();
        }
        return super.put(key, value);
    }

    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(1, null);
    }
}
