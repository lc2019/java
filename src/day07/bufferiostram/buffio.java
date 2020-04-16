package day07.bufferiostram;

import java.io.*;

public class buffio {
    public static void main(String[] args) throws IOException {
//        BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("demo1.txt"));
//        bf.write("hello world".getBytes());
        BufferedInputStream bfi = new BufferedInputStream(new FileInputStream("demo1.txt"));
        //字节读取
        int by;
        while ((by = bfi.read()) != -1) {
            System.out.print((char) by);
        }

        //字节数组读取
//        byte[] bys = new byte[1024];
//        int len;
//        while ((len = bfi.read(bys)) != -1) {
//            System.out.println(new String(bys, 0, len));
//        }
//
        bfi.close();
//        bf.close();
    }
}
