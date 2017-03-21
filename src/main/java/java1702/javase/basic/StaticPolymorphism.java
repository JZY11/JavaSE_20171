package java1702.javase.basic;

/**
 * Created by Tony.Jaa on 2017/3/17.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        System.out.println(calculatorTest.add(1, 2));
        System.out.println(calculatorTest.add(2.20, 3.21));
    }
}
//class java1702.javase.basic.CalculatorTest{
//    public int add( int x, int y){
//        return x + y;
//    }
//}
class CalculatorTest{
    public double add(double x, double y){
        return x + y;
    }
}
