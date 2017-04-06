package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/6.
 * JavaSE_20171.
 */
public class OverloadTest {
    public void test(){
        System.out.println("无参数");
    }
    public void test(String s){
        System.out.println("重载的test方法");
    }

    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();
        overloadTest.test();

    }
}
