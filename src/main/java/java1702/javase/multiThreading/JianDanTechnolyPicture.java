package java1702.javase.multiThreading;

import java.io.*;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/10.
 * JavaSE_20171.
 */
public class JianDanTechnolyPicture implements Runnable {
    private static final String PAGE_URL = "http://jandan.net/tag/%E9%AB%98%E7%A7%91%E6%8A%80/page";
    private int page;

    public JianDanTechnolyPicture(int page) {
        this.page = page;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 38; i++) {
            Thread thread = new Thread(new JianDanTechnolyPicture(i + 1));
            thread.start();
            System.out.println("page:" + (i + 1));
        }
    }

    @Override
    public void run() {
        int counter = 0;
        try {
            URL url = new URL(PAGE_URL + page);
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains("data-original")) {
                        String imgUrl = line.substring(line.indexOf("data-original=\"") + "data-original=\"".length(), line.indexOf("\" width"));
                        if (!imgUrl.startsWith("http")) {
                            imgUrl = imgUrl + "http:";
                        }
                        String extension = imgUrl.substring(imgUrl.lastIndexOf("."));
                        download(imgUrl, extension, page, ++counter);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void download(String imgUrl, String extension, int page, int counter) {
        try {
            URL url = new URL(imgUrl);
            try (
                    BufferedInputStream in = new BufferedInputStream(url.openStream());
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("images/" + page + "-" + counter + extension))) {
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
                System.out.println("\t" + page + "-" + counter);
            } catch (ConnectException e) {
                System.out.println("timeout...");
                //                download(imageUrl, extension);
                System.out.println(imgUrl);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
