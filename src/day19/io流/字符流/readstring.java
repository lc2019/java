package day19.io流.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class readstring {
    public static void main(String[] args) throws IOException {
        //创建字符输入管道
        Reader fr = new FileReader("test/demo8.txt");

        //2.按字符数组读取内容
        char[] bs = new char[1024];
        int len = 0;
        while ((len = fr.read(bs)) != -1) {
            System.out.println(new String(bs));
        }

    }
}
