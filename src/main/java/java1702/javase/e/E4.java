package java1702.javase.e;

/**
 * Created by Tony.Jaa on 2017/3/16.
 */
/*
*     将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。
*     从(i = 2)开始除 i++    最后一个数只能被它自身整除
*     10 = 2 * 5   100 = 2 * 2 * 5 * 5
*     1000 = 2 * 2 * 2 * 5 * 5 * 5     9 = 3 * 3
*
 */
public class E4 {
    public void get(int n){
        for (int i = 2; i < n + 1; i++) {
            if (n % i == 0) {
                if (i == n) {//判断是否为分解质因数的最后一部  证明这是最后一个分解过程   只能被它自身整除
                    System.out.print(i);
                }else {
                    System.out.println(i + "*");
                    get(n / i);
                }
                break;
            }
        }

    }

    public static void main(String[] args) {
        E4 e4 = new E4();
        int n = 90;
        System.out.println(n + "=");
        e4.get(90);//直接用e4来调用，因为返回方法为void不能控制台输出

    }
}