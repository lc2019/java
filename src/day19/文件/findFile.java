package day19.文件;

import java.io.File;

public class findFile {
    public static void main(String[] args) {
        File file = new File("d:/java");
        findFile(file, "java");

    }

    public static void findFile(File f, String name) {
        //1.判断文件是否存在,文件路径是否存在
        if (f.exists() && f.isDirectory()) {
            //2.提取全部一级文件对象
            File[] files = f.listFiles();
            //3.判断一级文件对象是否存在
            if (files != null && files.length > 0) {
                //4判断一级文件对象
                for (File file : files) {
                    //5判断是不是文件夹
                    if (file.isDirectory()) {
                        //6.判断文件是不是我要找的
                        if (file.getName().contains(name)) {
                            System.out.println(file.getAbsolutePath());
                        }
                    } else {
                        //文件夹，继续递归查找
                        findFile(file, name);
                    }
                }
            }
        }
    }
}
