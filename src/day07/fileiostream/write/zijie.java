package day07.fileiostream.write;

import java.io.FileOutputStream;
import java.io.IOException;

public class zijie {
    public static void main(String[] args) throws IOException {
        //创建输出流对象到文件
        FileOutputStream fos = new FileOutputStream("test.txt");
        //写入文件
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);

        //写数据的三种方法
//        write(byte[] x)
//        write(byte[]b,off,len x)

        //1字节数组写入
        byte[] bs = {97, 98, 99, 100, 101};
        fos.write(bs);

        //2getbytes方法
        byte[] bts = "abcde".getBytes();
        fos.write(bts);

        //3写入
        fos.write(bts, 1, 3);

        fos.close();//释放资源
    }
}
