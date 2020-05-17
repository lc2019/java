package day19.io流.字符缓冲流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereadwr {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test/demo8.txt");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }
    }
}
