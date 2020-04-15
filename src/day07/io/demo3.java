package day07.io;

import java.io.File;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
        //绝对路径，当前pro下创建文件
        File file = new File("test.txt");
        System.out.println(file.createNewFile());

        //删除文件和目录 目录存在文件则无法删除
        System.out.println(file.delete());

    }
}
