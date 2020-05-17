package day19.io流.字符缓冲流;

import java.io.*;

public class bufffileread {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test/demo8.txt"));
        //存储每行的数据
        String line;
        //循环读取每行的数据，读取完成返回null
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
