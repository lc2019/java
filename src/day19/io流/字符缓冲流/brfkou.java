package day19.io流.字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class brfkou {
    public static void main(String[] args) throws IOException {
        BufferedWriter wr = new BufferedWriter(new FileWriter("test/demo10.txt"));
        wr.write("hello ,2020");
        //换行
        wr.newLine();
    }
}
