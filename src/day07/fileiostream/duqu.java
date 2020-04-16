package day07.fileiostream;

import java.io.*;

public class duqu {
    public static void main(String[] args) throws IOException {
        meth3();
    }

    public static void meth() throws IOException {
        FileOutputStream fo = new FileOutputStream("456.mp4");
        FileInputStream fi = new FileInputStream("123.mp4");

        int by;
        while ((by = fi.read()) != -1) {
            fo.write(by);
        }
        fo.close();
        fi.close();
    }

    public static void meth2() throws IOException {
        FileOutputStream fo1 = new FileOutputStream("456.mp4");
        FileInputStream fi1 = new FileInputStream("123.mp4");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fi1.read(bys)) != -1) {
            fo1.write(bys, 0, len);
        }

        fo1.close();
        fi1.close();
    }

    public static void meth3() throws IOException {
        //读取
        BufferedInputStream bfi = new BufferedInputStream(new FileInputStream("123.mp4"));
        //写入
        BufferedOutputStream bfo = new BufferedOutputStream(new FileOutputStream("456.mp4"));

        int by;
        while ((by = bfi.read()) != -1) {
            bfo.write(by);
        }
        bfo.close();
        bfi.close();
    }
}
