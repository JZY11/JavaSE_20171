package java1702.javase.e;

/**
 * Created by Tony.Jaa on 2017/3/16.
 */
/*
*     求1 + 2！+ 3！+ ...+ 20!
 */
public class E21 {
    public long get(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * get(n -  1);
        }
    }
    public static void main(String[] args) {
//        java1702.javase.e.E21 e21 = new java1702.javase.e.E21();
//        System.out.println(e21.get(20));
//        long sum = 0;
//        for (int i = 1; i < 21; i++) {
//            sum += e21.get(i);//sum = sum + e21.get(i)
//        }
//        System.out.println(sum);



        long sum = 0;
        for (int i = 1; i < 21; i++) {//外循环为1 -> 21的遍历
            long n = 1;
            for (int j = 1; j < i + 1; j++) {//求i的阶层
                n *= j;
            }
            sum += n;
        }
        System.out.println(sum);

    }
}
