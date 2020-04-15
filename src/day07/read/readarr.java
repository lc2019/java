package day07.read;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class readarr {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("demo1.txt");
        FileOutputStream fw = new FileOutputStream("demo3.txt");

        //字节数组读取1次的个数
        byte[] bs = new byte[1024];

        //读取的长度
//        int len =fr.read(bs);
//        System.out.println(len);
//        fw.write(bs,0,len);
//        System.out.println(new String(bs,0,len));
        int len;
        while ((len = fr.read(bs)) != -1) {
            System.out.println(new String(bs, 0, len));
            //写入
            fw.write(bs, 0, len);
        }


        fw.close();
        fr.close();
    }
}
