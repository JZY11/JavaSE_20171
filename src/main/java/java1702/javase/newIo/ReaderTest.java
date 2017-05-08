package java1702.javase.newIo;
import java.io.*;


/**
 * Created by zhenya.1291813139.com
 * on 2017/4/18.
 * JavaSE_20171.
 */
/*
    Reader:是基于字符的输入流会一个一个字符的读取，且不会乱码，可读取中文
 */
public class ReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            Reader reader = new FileReader("test1");
//            int i;
//            while((i = reader.read()) != -1){
//                System.out.println((char) i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


        // 隐士调用了close()方法
        try(Reader reader = new FileReader("test1")){
            Writer writer = new FileWriter("");
            int i;
            while ((i = reader.read()) != -1){
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
