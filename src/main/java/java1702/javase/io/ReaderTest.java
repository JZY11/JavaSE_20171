package java1702.javase.io;
import java.io.*;


/**
 * Created by zhenya.1291813139.com
 * on 2017/4/18.
 * JavaSE_20171.
 */
public class ReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
//        Reader reader = null;
//        try {
//            reader = new FileReader("test1");
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
