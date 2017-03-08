/**
 * Created by Tony.Jaa on 2017/3/7.
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        //Bit 位 比特  Byte 字节 1 Byte=8 Bit
        // 1 KB= 1024 Btye  MB = 1024 KB   GB  TB  PB

        int x = 1;
        int y = 2;
        System.out.println(x << y);  //按位进行与运算   1与0类试与 true与false  ~x   >>(按位左移)   <<(按位右移)   >>>

        //0000..01(二进制1)
        //0000..10(二进制2)
        //......11(二进制3)
        //......100(二进制4)
    }
}
