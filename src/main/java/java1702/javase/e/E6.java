package java1702.javase.e;

/**
 * Created by Tony.Jaa on 2017/3/17.
 */
public class E6 {
    public  int min(int x, int y){
        return (x >= y) ? y : x;
    }
    public  int max(int x, int y){
        return (x <= y) ? y : x;
    }
    public static void main(String[] args) {
        //m = 10 ,n = 15  5为最大公约数   30为最大公倍数
        int m = 10;//不做输入了，直接定义int
        int n = 15;
        E6 e6 = new E6();
        int min = Math.min(m, n);
        for (int i = min; i > 0 ; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;
            }
        }
        int max = Math.max(m, n);
        for (int i = max; i < m * n + 1; i++) {
            if (i % m ==0 && i % n ==0) {
                System.out.println(i);
                break;
            }

        }
    }
}
