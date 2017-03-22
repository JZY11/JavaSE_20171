package java1702.javase.e;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/21.
 * JavaSE_20171.
 */
//一个偶数总能表示为两个素数之和
public class E44 {
    public boolean isPrime(int i){
        for (int j = 2; j < i / 2 + 1; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 20;//3  17   17 3
        //(2  18)  (3  17)...
        E44 e44 = new E44();//方法不可直接调用  需要创建类的实例
        for (int i = 2; i < n - 1; i++) {
            if (e44.isPrime(i) && e44.isPrime(n - i)) {
                System.out.println(n + "=" + i + "+" + (n - i));
                break;
            }
        }
      

    }
}
