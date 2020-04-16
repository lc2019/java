package day07.io.file;

import java.io.File;

/**
 * 使用递归调用目录
 */
public class dgd {
    public static void main(String[] args) {
        //创建file对象
        File file = new File("f:/大数据开发基础");
        getFiles(file);
    }

    public static void getFiles(File src) {
        //获取文件对象
        File[] files = src.listFiles();
        if (files != null) {
            for (File f :
                    files) {
                //如果是目录继续调用
                if (f.isDirectory()) {
                    getFiles(f);
                } else {
                    //不是目录的话输出绝对路径

                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }

}
