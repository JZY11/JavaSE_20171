package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/5.
 * JavaSE_20171.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer(); //声明StringBuffer对象
        buf.append("Hello");
//        buf.insert(0, "Hey");
        buf.append("World!!!");
        buf.replace(6, 11, "Sorry");
        buf.delete(0, 5);
        String str = buf.reverse().toString();
        fun(buf);         //   传递StringBuffer引用
        System.out.println(buf);
    }
    public static void fun(StringBuffer s){//接收StringBuffer引用
        s.append("MLDN").append("LiXingHua");//修改StringBuffer内容
    }
}
