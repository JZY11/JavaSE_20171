package java1702.javase.basic;

import java.util.Scanner;

/**
 * Created by Tony.Jaa on 2017/3/18.
 */
public class Test4 {
    double c;

    public void setC(double c) {
        this.c = c;
    }

    public double T(double c){
        return (9 / 5) * c + 32;

    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input c");
        double c = scanner.nextDouble();
        test4.T(50.4);
        System.out.println("F = (9 / 5 ) * c +32");
    }
}
