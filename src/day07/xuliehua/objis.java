package day07.xuliehua;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class objis {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obgis = new ObjectInputStream(new FileInputStream("demo3.txt"));
        //读取
        Object oj = obgis.readObject();

        //类型转换
        stu s1 = (stu) oj;
        System.out.println(s1.getName() + s1.getAge());
        obgis.close();
    }
}
