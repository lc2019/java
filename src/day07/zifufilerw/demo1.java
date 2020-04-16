package day07.zifufilerw;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * filereader
 * filewrite
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        //读取文件
        FileReader fr = new FileReader("demo3.txt");
        //写入文件
        FileWriter fw = new FileWriter("demo4.txt");

//        //1读取
//        int by;
//        while ((by=fr.read())!=-1){
//            fw.write((char)by);
//        }

        //字节数组
        char[] bys = new char[1024];
        int len;
        while ((len = fr.read(bys)) != -1) {
            fw.write(bys, 0, len);
        }

        fw.close();
        fr.close();
    }
}
