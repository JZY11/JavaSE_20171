package java1702.javase.io;

import java.io.*;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/21.
 * JavaSE_20171.
 */
/*
      基于字符&字节的输入和输出
 */
public class BufferedTest {
    public static void main(String[] args) { // buffered 缓冲(提高输入输出效率)
        try(  //若去掉声明的两个资源前的Buffered则copy的一个大型视频&音频的速度会慢的多
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:/Users/Tony.Jaa/Desktop/你就不要想起我-田馥甄.mp3"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/Users/Tony.Jaa/Desktop/你就不要想起我.mp3"))
                ) {
            int i;
            while ((i = in.read()) != -1){
                out.write(i);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
