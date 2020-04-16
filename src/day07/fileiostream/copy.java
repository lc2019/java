package day07.fileiostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args) throws IOException {
        //读取的文件
        FileInputStream fr = new FileInputStream("demo1.txt");
        //写入发文件
        FileOutputStream fw = new FileOutputStream("deme2.txt");

        //读取数据
        int by;
        while ((by = fr.read()) != -1) {
            fw.write(by);
        }

        fw.close();
        fr.close();
    }
}
