package java1702.javase.basic;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Tony.Jaa on 2017/3/10.
 */
public class PracticeTest {
    public PracticeTest() {
        super();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        System.out.println(s);
        switch (s) {
            case "A":
                System.out.println("[90,100");
                break;
            case "B":
                System.out.println("[80,90)");
                break;
            case "C":
                System.out.println("[60,80)");
                break;
            case "D":
                System.out.println("[0,60)");
                break;
            default:
                System.out.println("不满足条件");
                break;

            }

        }
    }





