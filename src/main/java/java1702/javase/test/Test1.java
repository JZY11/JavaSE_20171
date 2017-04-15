package java1702.javase.test;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/15.
 * JavaSE_20171.
 */
public class Test1 {
    public static void main(String[] args) {
        String s1 = "1,3,5";
        String s2 = "2,4,1,7,5";
        int len1 = 3;
        int len2 = 5;
        Test1 test1 = new Test1();

        System.out.println(test1.getNum(len1, s1, len2, s2));

    }

    public int getNum(int len1, String s1, int len2, String s2) {
        int count = 0;
        int len = 0;
        String[] arr1 = s1.split(",");
        String[] arr2 = s2.split(",");
        if (len1 > len2) len = len2;
        else len = len1;
        for (int i = 0; i < len; i++) {
            if (!arr1[len1 - i - 1].equals(arr2[len2 - i - 1])) {
                count++;
            }
        }
        return count;
    }
}
