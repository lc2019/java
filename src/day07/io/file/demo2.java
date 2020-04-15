package day07.io.file;

import java.io.File;

/**
 * 方法测试
 */
public class demo2 {
    public static void main(String[] args) {
        File f1 = new File("f:/大数据开发基础/java");
        //判断目录 bool
        System.out.println(f1.isDirectory());
        //判断文件
        System.out.println(f1.isFile());
        //文件是否存在
        System.out.println(f1.exists());

        //文件绝对路径
        System.out.println(f1.getAbsolutePath());
        //文件名称
        System.out.println(f1.getName());
        //文件路径
        System.out.println(f1.getPath());
        //文件父目录
        System.out.println(f1.getParent());
        //文件父目录文件
        System.out.println(f1.getParentFile());
        System.out.println("=================================");
        //目录下的文件
        String[] s = f1.list();
        for (String s1 :
                s) {
            System.out.println(s1);
        }
        System.out.println("=================================");
        //目录下的所有目录（一级）和文件--文件对象
        File[] files = f1.listFiles();
        for (File f :
                files) {
            System.out.println(f.getName() + "," + f.getPath());
        }
    }
}
