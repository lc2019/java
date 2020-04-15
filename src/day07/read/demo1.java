package day07.read;

import java.io.FileInputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("demo1.txt");
//        //1次读取1个byte
//        int bs = fr.read();
//        System.out.println((char)bs);

        //循环读取 读取完成到达末尾返回-1
//        int bts = fr.read();
//        while (bts !=-1){
//            System.out.println((char)bts);
//            bts = fr.read();
//        }
        int by;
        while ((by = fr.read()) != -1) {
            //自动读取换行
            System.out.print((char) by);
        }
        fr.close();

    }
}
