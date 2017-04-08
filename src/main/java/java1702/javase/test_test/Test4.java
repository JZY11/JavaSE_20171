package java1702.javase.test_test;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/8.
 * JavaSE_20171.
 */
public class Test4 {
    private String name;
    private double pay;

    public Test4(String name, double pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
class Scientist extends Test4{
    private int endPay;

    public int getEndPay() {
        return endPay;
    }

    public void setEndPay(int endPay) {
        this.endPay = endPay;
    }

    public Scientist(String name, double pay, int endPay) {
        super(name, pay);
        this.endPay = endPay;

    }
}
class Teacher extends Test4{
    private int oneDayPay;

    public int getOneDayPay() {
        return oneDayPay;
    }

    public void setOneDayPay(int oneDayPay) {
        this.oneDayPay = oneDayPay;
    }

    public Teacher(String name, double pay, int oneDayPay) {
        super(name, pay);
        this.oneDayPay = oneDayPay;

    }
    public void printScientist(Scientist scientist){
        System.out.println(scientist.getName() + "一年的工资是:" + (scientist.getPay() * 12 + scientist.getEndPay()));
    }

    public void printTeacher(Teacher t){
        System.out.println(t.getName() + "一年的工资是：" + (t.getOneDayPay() * 365 + t.getPay() * 12));
    }
}
