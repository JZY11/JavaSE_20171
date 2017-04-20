package java1702.javase.io;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;



/**
 * Created by zhenya.1291813139.com
 * on 2017/4/18.
 * JavaSE_20171.
 */
public class ReaderTest {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("test1");
            int i;
            while((i = reader.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
