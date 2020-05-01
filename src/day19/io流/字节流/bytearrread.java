package day19.io流.字节流;

import java.io.*;

public class bytearrread {
    public static void main(String[] args) throws IOException {
        //直接创建字节输入流管道与源文件路径接通
        InputStream fis = new FileInputStream(new File("test/java.txt"));

        //定义一个字节数组读取数据
        byte[] bs = new byte[3];
        //从管道读取字节装入到字节数组，返回字节数量,单次读取
        int len = fis.read(bs);
//        System.out.println("读取字节数" + len);

        //循环读取
        while ((len = fis.read(bs)) != -1) {
            System.out.print(new String(bs, 0, len));

        }

        //字节数组遇到中文读取问题解决 -字符读取

    }
}
