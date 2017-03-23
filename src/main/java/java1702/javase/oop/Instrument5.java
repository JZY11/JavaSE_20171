package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/23.
 * JavaSE_20171.
 */
public interface Instrument5 {//Cannot have method definitions:实现需要有接口
    void play();//Automatically public
    String what();
    void adjust();
}
class Wind5 implements Instrument5{

    @Override
    public void play() {
        System.out.println("Wind5.play");
    }

    @Override
    public String what() {
        return "Wind5";
    }

    @Override
    public void adjust() {

    }
}
