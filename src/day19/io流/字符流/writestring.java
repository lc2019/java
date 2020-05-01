package day19.io流.字符流;

import java.io.FileWriter;
import java.io.IOException;

public class writestring {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test/demo9.txt");
        fw.write("hello.nihao");
        fw.write("你好.".toCharArray());
    }
}
