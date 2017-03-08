/**
 * Created by Tony.Jaa on 2017/3/8.
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 0;
        i += 1;//二元运算符   等价于adacacas = adacacas+1
        i -= 2;
        i *= 3;
        i /= 4;
        i %= 5;
        boolean b = true;
        b &=false;//b=b & false
        i &= 1;//Bitwise(位)   位运算与(先将其变为二进制)    &   i = i & 1

        System.out.println("i");
        //  &=针对布尔值或定点类型值
    }
}
