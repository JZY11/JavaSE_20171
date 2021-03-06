package java1702.javase.regExp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/27.
 * JavaSE_20171.
 */
public class Demo01 {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("l",Pattern.CASE_INSENSITIVE);CASE_INSENSITIVE大小写不敏感，为整型，整型值为2
        //  0x开头的为16进制   0开头的为八进制  0b开头的为二进制
        System.out.println(Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile("(?i)l");
        Matcher matcher = pattern.matcher("heLLo");
//        System.out.println(matcher.find()); // find() 可看成指针  方法不返回具体值，返回布尔
        while (matcher.find()){// matcher.find() 可看成指针  find()返回由以前匹配操作所匹配的输入子序列
            System.out.println(matcher.group());
        }
    }
}
