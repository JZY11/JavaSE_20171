package java1702.javase.tt;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/30.
 * JavaSE_20171.
 */
/*
   找出字符串中出现次数最多的字母和出现的次数
 */
public class t2 {
    public static void main(String[] args) {
        String s = "aabbbcccddddfffff";
        int max = 0;
        char c = 0;
        for (int i = 0; i < s.length(); i++) {
            int counter = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    counter++;
                }
            }
            if (counter >= max) {
                max = counter;
                c = s.charAt(i);
            }
        }
        System.out.println(c + ":" + max);
    }
}
