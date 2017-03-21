package java1702.javase.e;

import java.util.Scanner;

/**
 * Created by Tony.Jaa on 2017/3/14.
 */
public class E5 {
    public static void main(String[] args) {
        int grade = 70;
        if(grade >= 90 && grade <= 100){
            System.out.println("A");
        }
        else if(grade >= 60 && grade < 89){
            System.out.println("B");
        }
        else if(grade >= 0 && grade < 60){
            System.out.println("C");
        }
        else{
            System.out.println("error");
        }

    }
}
