package day07.iostream;

import java.io.*;

public class copy {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(new FileInputStream("java.txt"));

        OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("demo3.txt"));

//        int by;
//        while ((by = ir.read()) != -1) {
//            ow.write((char) by);
//        }


        char[] bys = new char[1024];
        int len;
        while ((len = ir.read(bys)) != -1) {
            ow.write(new String(bys, 0, len));
        }


        ow.close();
        ir.close();
    }
}
