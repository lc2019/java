package day07.io;

import java.io.File;
import java.io.IOException;

/**
 * 构造方法
 * File(File parent, String child)
 * 从父抽象路径名和子路径名字符串创建新的 File实例。
 * File(String pathname)
 * 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 * File(String parent, String child)
 * 从父路径名字符串和子路径名字符串创建新的 File实例。
 * File(URI uri)
 * 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("f:/大数据开发基础/java");
        System.out.println(f1);

        File f2 = new File("f:/大数据开发基础", "java");
        System.out.println(f2);

        //创建文件返回bool 存在的话返回false
        File f3 = new File("f:/大数据开发基础/java/java.txt");
        System.out.println(f3.createNewFile());

        //创建目录
        File f4 = new File("f:/大数据开发基础/java/test");
        System.out.println(f4.mkdir());

        //创建多级目录
        File f5 = new File("f:/大数据开发基础/java/demo/test");
        System.out.println(f5.mkdirs());
    }
}
