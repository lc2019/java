package day07.zfbuffferio;

import java.io.*;

public class bufferrw {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("demo4.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("demo5.txt"));
//
//        int by;
//        while ((by=br.read())!=-1){
//            bw.write(by);
//        }

        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }

        bw.close();
        br.close();
    }
}
