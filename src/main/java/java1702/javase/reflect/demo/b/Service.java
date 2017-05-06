package java1702.javase.reflect.demo.b;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
/*
     强耦合-->松散耦合 过程叫做解耦合
     Service不需要改动，因为没有体现出具体要用哪个底层来实现，体现出来的只是一个抽象的接口DeviceWriter
     向设备里写数据，但具体什么设备没有表明
 */
public class Service  {
    private DeviceWriter deviceWriter;// 用接口来声明实例对象，但它并没有实例

//    public Service(DeviceWriter deviceWriter) {// (1)
//        this.deviceWriter = deviceWriter;
//    }

    public void setDeviceWriter(DeviceWriter deviceWriter) {// (2)
        this.deviceWriter = deviceWriter;
    }

    public void write() {
//        deviceWriter.writeToDevice();
    }
}
