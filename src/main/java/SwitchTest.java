/**
 * Created by Tony.Jaa on 2017/3/8.
 */
public class SwitchTest {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 3:
            case 4:
            case 5:
                System.out.println(x + "春季");
                break;
        }
        switch (x) {
            case 6:
            case 7:
            case 8:
                System.out.println(x + "夏季");
                break;
        }
        switch (x) {
            case 9:
            case 10:
            case 11:
                System.out.println(x + "秋季");
                break;
        }
        switch (x) {
            case 12:
            case 1:
            case 2:
                System.out.println(x + "冬季");
                break;
        }
    }
}
