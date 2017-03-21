package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/21.
 * JavaSE_20171.
 */
public abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();

    public static void main(String[] args) {
        Triangle triangle  = new Triangle(3, 4, 5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        Circle circle = new Circle(5.0);
        System.out.println(circle.getArea());//因有返回类型double  若为void型则可circle.getArea就不需要return,直接控制输出
        System.out.println(circle.getPerimeter());
        Quadrangle quadrangle = new Quadrangle(3, 5, 7, 15);
        System.out.println(quadrangle.getPerimeter());
    }
}
class Circle extends Shape{
//    private double x;
//    private double y;//x y 定义圆心位置
    private double pai = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {//抽象类的子类必须实现抽象类中所有的抽象方法
        return 2 * pai * radius;
    }

    @Override
    public double getArea() {
        return pai * Math.pow(radius, 2);
    }
}
class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if ((a + b) >c && (b + c) >a && (a + c) >b) {

        this.a = a;
        this.b = b;
        this.c = c;
        }
        else {
            System.out.println("error...");
            System.exit(0);//终止当前正在运行的 Java 虚拟机(java.lang.System  java语言包）
        }
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return s * Math.sqrt((s - a) * (s - b) * (s - c));
    }
}
class Quadrangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrangle(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return a +b + c +d;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
