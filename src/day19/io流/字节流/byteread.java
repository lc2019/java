package day19.io流.字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class byteread {
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        File file = new File("test/java.txt");
        //2.创建字节输入流管道
        FileInputStream fis = new FileInputStream(file);
        //读取字节，读完返回-1
//        int r1 = fis.read();
//        int r2 = fis.read();
//        int r3 = fis.read();
//        System.out.println(r3);
        //字节读取
        int ch = 0;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }


    }
}
