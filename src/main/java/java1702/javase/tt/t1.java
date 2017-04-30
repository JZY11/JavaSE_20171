package java1702.javase.tt;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/30.
 * JavaSE_20171.
 */
public class t1 {
    public static void main(String[] args) {
        String s1 = "1,3,5,6,7,8";
        String s2 = "2,4,1,7,5";
        if (s1.length() > s2.length()) {
            String temp = s2; //temporary 临时的
            s2 = s1;
            s1 = temp;
        }
        int counter = 0;
        String[] strings1 = s1.split(",");
        for (String s : strings1) {
            if(s2.contains(s)){
                counter++;
            }
        }
        System.out.println(strings1.length - counter);
    }
}
