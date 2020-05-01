package day19.io流.字节缓冲流;

import java.io.*;

public class bufferedinputstream {
    public static void main(String[] args) throws IOException {
        InputStream br = new BufferedInputStream(new FileInputStream("test/demo8.txt"));

        byte[] bs = new byte[1024];
        int len;
        while ((len = br.read(bs)) != -1) {
            System.out.println(new String(bs, 0, len));
        }
    }
}
