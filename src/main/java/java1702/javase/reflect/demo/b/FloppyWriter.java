package java1702.javase.reflect.demo.b;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
/*
     底层实现类
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writerToDevice() {
        System.out.println("writer to floppy...");
    }
}
