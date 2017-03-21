package java1702.javase.e;

/**
 * Created by Tony.Jaa on 2017/3/15.
 */
/*
*递归有明显的特点：先看最简单的情况做一个返回，其他的情况再次调用当前的方法但参数会发生变化
 */
/*
*   n:要移动圆盘的个数    src：从哪里开始移动    use: 利用哪个柱子  dest（destnation)去哪个柱子
*
 */
public class E52 {
    public int counter;
    public void hanoi(int n, String src, String use, String dest) {
        if (n == 1) {
            System.out.println(src + "- " + dest);
            counter++;
        } else {
            hanoi(n - 1, src, dest, use);
            System.out.println(src + "-" + dest);
            counter++;
            hanoi(n - 1, use, src, dest);
        }
    }


    public static void main(String[] args) {
        E52 e52 = new E52();
        e52.hanoi(2, "A", "B", "C");
        System.out.println(e52.counter);

    }
}
