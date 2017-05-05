package java1702.javase.reflect.demo.a;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
/*
   高层应用类
 */
// 强耦合
public class Service {
//    private FloppyWriter floppyWriter;// null
    private ProtableHdWriter portableHdWriter;

//    public Service(FloppyWriter floppyWriter) {
//        this.floppyWriter = floppyWriter;
//    }


    public Service(ProtableHdWriter portableHdWriter) {
        this.portableHdWriter = portableHdWriter;
    }



    public void write(){
//        floppyWriter.writeToFloppy();
        portableHdWriter.writeToPortableHd();
    }
}
