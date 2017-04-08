package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/8.
 * JavaSE_20171.
 */
public class BaseConstructor {
    public double size;
    public String name;

    public BaseConstructor(double size, String name) {
        this.size = size;
        this.name = name;
    }
}

class SubConstuctor extends BaseConstructor {
    public String color;

    public SubConstuctor(double size, String name, String color) {
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        SubConstuctor subConstuctor = new SubConstuctor(5.6, "测试对象","red");
        System.out.println(subConstuctor.size + "----" + subConstuctor.name + "----" + subConstuctor.color);
    }
}
