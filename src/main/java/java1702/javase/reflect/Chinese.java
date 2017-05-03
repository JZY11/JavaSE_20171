package java1702.javase.reflect;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/3.
 * JavaSE_20171.
 */
public class Chinese extends java1702.javase.basic.Human {
    private int i;

    public Chinese(int i) {
        this.i = i;
    }
    public void m(String s){
        System.out.println(s);
    }
}// Class<Chinese> chinese

class ChineseTest {// Run time 运行时
    public static void main(String[] args) throws ClassNotFoundException {
        Chinese chinese = new Chinese(1);
        Class<Chinese> chineseClass1 = Chinese.class;
        Class chineseClass2 = chinese.getClass();
        Class chineseClass3 = Class.forName("java1702.javase.reflect.Chinese");
    }

}
