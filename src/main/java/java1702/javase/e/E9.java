package java1702.javase.e;

/**
 * Created by Tony.Jaa on 2017/3/17.
 */
public class E9 {
    public int get(int n){
        int sum = 0;
        for (int i = 1; i < n/2 + 1 ; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        E9 e9 = new E9();
        for (int i = 1; i < 1000; i++) {
            if (i == e9.get(i)) {
                System.out.println(i + "是一个完数");
            }
        }
    }
}
