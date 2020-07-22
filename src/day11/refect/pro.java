package day11.refect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class pro {
    public static void main(String[] args) throws IOException {
        //加载配置文件内容
        InputStream in = ClassLoader.getSystemResourceAsStream("resouces.properties");

        //2.数据保存到集合
        Properties pro = new Properties();

        //通过Properties的方法把流中的数据保存到集合中
        pro.load(in);

        System.out.println(pro);

    }
}
