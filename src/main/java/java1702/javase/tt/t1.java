package java1702.javase.tt;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/30.
 * JavaSE_20171.
 */
/*
   输入字符串长度len1，字符串s1，字符串长度len2，字符串s2，从后向前比较
   以短字符串为标准，输出不同元素的个数。
   例如：s1=“1,3,5” len1=3  s2=“2,4,1,7,5” len2=5
   输出：1
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
        int counter = 0;// 定义计数器
//        String[] strings1 = s1.split(",");
//        for (String s : strings1) {
//            if(s2.contains(s)){
//                counter++;
//            }
//        }
//        System.out.println(strings1.length - counter);
        String[] string1 = s1.split(",");
        String[] string2 = s2.split(",");
        for (int i = 0; i < string1.length; i++) {
            if (string1[string1.length -1 - i].equals(string2[string2.length - 1 - i])) {
                counter++;
            }
        }
        System.out.println(string1.length - counter);
    }
}
