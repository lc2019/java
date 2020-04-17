package day07.xuliehua;

import java.io.*;

/**
 * java.io.InvalidClassException 解决
 * 加入  ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;
 */
public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    public static void write() throws IOException {

        ObjectOutputStream objos = new ObjectOutputStream(new FileOutputStream("demo3.txt"));
        stu s1 = new stu("lc", 20);
        //序列化
        objos.writeObject(s1);

        objos.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream obgis = new ObjectInputStream(new FileInputStream("demo3.txt"));
        //读取
        Object oj = obgis.readObject();

        //类型转换
        stu s1 = (stu) oj;
        System.out.println(s1.getName() + s1.getAge());
        obgis.close();
    }
}
