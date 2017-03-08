/**
 * Created by Tony.Jaa on 2017/3/8.
 */
public class MonthTest {
    public static void main(String[] args) {
        int x = 2;
        if(x == 3 || x == 4 || x== 5){
            System.out.println(x+"春季");
        }
        else if(x == 6 || x == 7 || x== 8){
            System.out.println(x+"夏季");
        }
        else if(x == 9 || x == 10 || x== 11){
            System.out.println(x+"秋季");
        }
        else if(x == 12 || x == 1 || x== 2){
            System.out.println(x+"冬季");
        }
        else{
            System.out.println("此份不存在");
        }
//        if(x > 12 || x<1){
//            System.out.println("该月份不存在");
        }
    }
