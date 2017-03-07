/**
 * Created by Tony.Jaa on 2017/3/7.
 */
public class CharTest {
    public static void main(String[] args) {
        char c1=123;
        System.out.println((int)c1);//(int)强制类型转换

        char c2='a';
        System.out.println(c2);
        char c3='\123';//八进制0~7
        System.out.println((int)c3);
        char c4='\u4e00';//十六进制:0-9 A-F [4E00,9FBB]
        System.out.println(c4);

        char c5='\t';//tab 水平制表符
        System.out.println(c5);
        char c6='\n';
        System.out.println(c6);

        System.out.print("a");//ln-line
        System.out.print("b");//ln-line
        System.out.print(c5);//ln-line
        System.out.print("c");//ln-line;
        System.out.print("d");//ln-line
    }
}
