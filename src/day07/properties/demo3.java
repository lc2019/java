package day07.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class demo3 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        //读取文件
        FileReader fr = new FileReader("game.txt");
        pro.load(fr);
        fr.close();

        //获取v
        String c = pro.getProperty("count");
        int num = Integer.parseInt(c);

        if (num >= 3) {
            System.out.println("game over");
        } else {
            Guessnum.start();
            num++;
            //设置kv
            pro.setProperty("count", String.valueOf(num));
            //写入文件
            FileWriter fw = new FileWriter("game.txt");
            //写入
            pro.store(fw, null);
            fw.close();
        }
    }
}
