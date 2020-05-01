package day19.io流.字节缓冲流;

import java.io.*;

public class bufferoutputstream {
    public static void main(String[] args) throws IOException {
        OutputStream bo = new BufferedOutputStream(new FileOutputStream("demo10.txt"));
        bo.write('h');
        bo.write("hello 2020".getBytes());

        //输入流
        InputStream bis = new BufferedInputStream(new FileInputStream("src/字符流.png"));
        //输出流
        OutputStream bos = new BufferedOutputStream(new FileOutputStream("src/字符流demo.jpg"));

        //定义字节数组
        byte[] bs = new byte[1024];
        int len;
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
    }

}
