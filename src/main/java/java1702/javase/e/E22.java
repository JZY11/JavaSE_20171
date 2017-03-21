package java1702.javase.e;

/**
 * Created by Tony.Jaa on 2017/3/16.
 */
/*
*     利用递归方法求5！= 5 * 4 * 3 * 2 * 1 = 5 * (5-1)!
*     递归方法都可以变为循环
 */
public class E22 {
    public int get(int n){
        if (n == 1){
            return 1;
        }
        else {
            return n * get(n - 1);
        }
    }
    public static void main(String[] args) {
//        java1702.javase.e.E22 e22 = new java1702.javase.e.E22();
//        System.out.println(e22.get(5));
        int result = 1;
        for (int i = 1; i < 6; i++) {
            result *= i;//二元赋值运算符  result = result * i；
        }
        System.out.println(result);



    }
}
