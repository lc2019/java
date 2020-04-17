package day07.copyfile;

import java.io.*;

public class copyio {
    public static void main(String[] args) throws IOException {
        File srcfile = new File("test");
        File dstfile = new File("f:/大数据开发基础/java/src");
        copyfold(srcfile, dstfile);
    }

    private static void copyfold(File srcfile, File dstfile) throws IOException {
        if (srcfile.isDirectory()) {
            //目录名称
            String srcf = srcfile.getName();

            //目标目录
            File dsf = new File(dstfile, srcf);

            //不存在就创建文件
            if (!dsf.exists()) {
                dsf.mkdir();
            }

            File[] files = srcfile.listFiles();
            //递归遍历
            for (File f : files) {
                copyfold(f, dsf);
            }
        } else {
            //如果是文件直接复制-文件格式
            File newfile = new File(dstfile, srcfile.getName());
            copyfile(srcfile, newfile);
        }

    }

    /**
     * 文件的字节流赋值
     *
     * @param srcfile 源文件
     * @param dstfile 目的文件
     * @throws IOException
     */
    private static void copyfile(File srcfile, File dstfile) throws IOException {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(dstfile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = br.read(bys)) != -1) {
            bw.write(bys, 0, len);
        }

        bw.close();
        br.close();
    }
}
