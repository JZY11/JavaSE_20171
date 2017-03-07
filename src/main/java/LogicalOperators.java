/**
 * Created by Tony.Jaa on 2017/3/7.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 =false;
//        System.out.println(b1 & b2);
//        System.out.println(b1 &/ |/ ^ /!b2);//^b1 b2不相同，结果为ture  !取反  单操作数运算  ！运算级最高
        // &与&&运算规则相同 |与||一样
        int x = 3;
        int y = 1;
        boolean z = (x > y)&&(y++  <= x);
        System.out.println(z);
        System.out.println(y);
        int a = 2;
        int b = 3;
        boolean c= (a > b)&&(b++<=a);
        System.out.println(c);
        System.out.println(b);//条件与的两种情况

    }
}
