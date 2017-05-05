package java1702.javase.reflect.demo.b;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
//        service.setDeviceWriter(new PortableHdWriter());
        service.write();
    }
}
