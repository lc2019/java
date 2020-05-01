package day19.io流.字节流;

import java.io.*;

public class bytecopy {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\hhxx.jpg.jpg");
        OutputStream fos = new FileOutputStream("test.jpg");

        //创建字节数组复制数据，字节输入管道读取数据，写入到字节输出管道
        byte[] bs = new byte[1024];
        //每次读取的字节数
        int len;
        while ((len = fis.read(bs)) != -1) {
            fos.write(bs, 0, len);
        }

        //关闭流
        fos.flush();
        fos.close();
        fis.close();
    }
}
