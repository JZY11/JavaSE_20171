package java1702.javase.reflect.demo.b;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
public class Test {
    public static void main(String[] args) {
//      Service service = new Service(new FloppyWriter());//(1)  传接口某个实现类的实例,如：new FloppyWriter()，new ProtableHdWriter()
                                                         // 因为接口不能被实例化
        Service service = new Service();
        service.setDeviceWriter(new FloppyWriter());// (2)
        service.write();
    }
}
