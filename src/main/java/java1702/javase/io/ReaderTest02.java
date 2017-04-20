package java1702.javase.io;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/20.
 * JavaSE_20171.
 */
/*

 */
public class ReaderTest02 {
    public static void main(String[] args) {
        try(Reader reader = new FileReader("test")) {
            int i;
            while ((i = reader.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
