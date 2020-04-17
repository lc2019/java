package day07.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class demo2 {
    public static void main(String[] args) throws IOException {
        mystor();
        myload();
    }

    public static void myload() throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader("pro.txt");
        pro.load(fr);
        fr.close();
        System.out.println(pro.getProperty("01"));
    }

    public static void mystor() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("01", "lc");
        pro.setProperty("02", "lzc");
        pro.setProperty("03", "lcc");

        FileWriter fw = new FileWriter("pro.txt");
        pro.store(fw, null);
        fw.close();
    }
}
