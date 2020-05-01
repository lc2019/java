package day19.io流.字节流;

import java.io.*;

public class outputstreamdemo {
    public static void main(String[] args) throws IOException {
        /**
         * 文件字节输出流-内存数据写到磁盘
         */
        //创建管道输出与目标文件路径接通
        OutputStream fis = new FileOutputStream("test/demo8.txt");

        //写数据
        fis.write(97);
        fis.write(65);
        fis.write('c');
        fis.write(100);
        //刷新到本地文件，刷新后管道可以继续使用

        //字节数组写入
        byte[] bytes = {97, 98, 99, 100};
        fis.write(bytes);

        byte[] bs1 = "你好，2020，对路璐好一点，宽容一点，多包容一点，你的老婆要自己疼".getBytes();
        fis.write(bs1);
        fis.flush();
        //关闭管道
        fis.close();


    }
}
