package java1702.javase.reflect.demo.a;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
/*
    测试类
 */
public class Test {
    public static void main(String[] args) {
//        Service service = new Service(new FloppyWriter());
        Service service = new Service(new ProtableHdWriter());
        service.write();
    }
}
