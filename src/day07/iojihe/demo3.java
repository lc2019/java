package day07.iojihe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class demo3 {
    public static void main(String[] args) throws IOException {
        /*
        1.字符输入流
        2.集合对象
        3.读取
        4，存储到集合
        5.生成随机数
        6.在arr中获取值
         */
        BufferedReader br = new BufferedReader(new FileReader("arr.txt"));

        ArrayList<String> arr = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            arr.add(line);
        }

        Random r = new Random();
        int rr = r.nextInt(arr.size());

        System.out.println(arr.get(rr));
    }
}
