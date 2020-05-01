package day19.io流.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereadstring {
    public static void main(String[] args) throws IOException {
        //创建fileread对象
        FileReader fr = new FileReader("test/demo8.txt");
        //读取单个字符，读取完毕返回-1
        int len = fr.read();
        System.out.println((char) len);

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

    }
}
