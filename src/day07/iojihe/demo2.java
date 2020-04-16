package day07.iojihe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 文件到集合
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("arr.txt"));
        ArrayList<String> arr = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            //元素添加到集合
            arr.add(line);
        }

        br.close();
        for (String s :
                arr) {
            System.out.println(s);
        }
    }
}
