package day07.iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ir {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(new FileInputStream("demo2.txt"));
        int ch;
        while ((ch = ir.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
