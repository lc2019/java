package day0_HDFS;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.*;
import java.net.URI;


public class demo1_fs {
    private Configuration conf;
    private FileSystem fs;

    /**
     * 每次test执行前先执行before
     *
     * @throws Exception
     */
    @Before
    public void before() throws Exception {
        conf = new Configuration();
        fs = FileSystem.get(new URI("hdfs://master:9000"), conf, "root");

    }

    /**
     * 每次test执行后再执行
     */
    @After
    public void after() throws Exception {
        fs.close();
    }

    @Test
    public void testFileSystem() throws Exception {
        //配置获取
        Configuration conf = new Configuration();
        //hdfs的路径  conf  用户
        FileSystem fs = FileSystem.get(new URI("hdfs://master:9000"), conf, "root");
        System.out.println("fs" + fs);

        //对fs的操作
        fs.mkdirs(new Path("/test1"));
        fs.close();
    }

    /**
     * 上传文件
     *
     * @throws IOException
     */
    @Test
    public void testCOpyFromLocal() throws IOException {
        fs.copyFromLocalFile(new Path("/Users/mac/test.txt"), new Path("/user/sgg"));
    }

    /**
     * 下载文件
     *
     * @throws IOException
     */
    @Test
    public void testCopytoLocal() throws IOException {
        fs.copyToLocalFile(new Path("/user/sgg/test.txt"), new Path("/Users/mac/"));
    }

    /**
     * 文件和目录删除
     */
    @Test
    public void testDel() throws Exception {
        fs.delete(new Path("/128"), true);
    }

    /**
     * 文件查看
     *
     * @throws Exception
     */
    @Test
    public void testlistfiles() throws Exception {
        //返回文件对象迭代器
        RemoteIterator<LocatedFileStatus> ddq = fs.listFiles(new Path("/"), false);
        //迭代
        while (ddq.hasNext()) {
            LocatedFileStatus files = ddq.next();
            System.out.println(files.getPath());
            System.out.println(files.getBlockLocations());
            System.out.println(files.getReplication());
        }

    }

    /**
     * 文件和文件夹的判断
     */
    @Test
    public void testFile() throws Exception {
        //获取迭代对象
        FileStatus[] fls = fs.listStatus(new Path("/"));
        //遍历
        for (FileStatus fl : fls) {
            if (fl.isFile()) {
                //路径+名称
                System.out.println(fl.getPath().getName() + " is file");
            } else {
                System.out.println(fl.getPath().getName() + " is dir");
            }
        }
    }

    /**
     * 文件目录以及子目录
     */
    @Test
    public void showFils() throws Exception {
        testfileordir(new Path("/"), fs);
    }

    public void testfileordir(Path path, FileSystem fs) throws Exception {
        FileStatus[] fss = fs.listStatus(path);
        for (FileStatus fls : fss) {
            //文件
            if (fls.isFile()) {
                //根目录文件
                if (path.toString().equals("/")) {
                    System.out.println("file :" + "/" + fls.getPath().getName());
                } else {
                    //把文件名称前加上目录
                    System.out.println("file :" + path.toString() + "/" + fls.getPath().getName());
                }
            } else {
                //fls.getPath() 目录路径/usr/sgg   getname获取的是文件名称test.txt
                System.out.println("dir :" + fls.getPath().toString().substring("hdfs://master:9000".length()));
                String dir = fls.getPath().toString().substring("hdfs://master:9000".length());
                //递归
                testfileordir(new Path(dir), fs);
            }
        }
    }

    /**
     *  io流上传文件
     */
    @Test
    public  void  testIO() throws Exception {
        //1.输入流
        FileInputStream fis  = new FileInputStream("/Users/mac/Downloads/edraw9.1破解版.dmg");
        //2.输出流 hdfs上create创建文件
        FSDataOutputStream fds  = fs.create(new Path("/128/"));
        //3.对拷
        IOUtils.copyBytes(fis,fds,conf);

//        byte[] bs =  new byte[1024];
//        int len;
//        while ((len=fis.read(bs))!= -1){
//            fds.write(bs,0,len);
//        }
        //关闭流
        fds.close();
        fis.close();
    }

    /**
     * 流下载文件
     */
    @Test
    public  void testDownload() throws Exception {
        //输入文件 hdfs打开文件open
        FSDataInputStream fis  = fs.open(new Path("/demo.txt"));
        //输出文件 文件系统创建文件
        FileOutputStream fio  = new FileOutputStream(new File("/Users/mac/wc.txt"));
        IOUtils.copyBytes(fis,fio,conf);

        fio.close();fis.close();

    }

    /**
     * 定位文件读取
     */
    @Test
    public  void testSeek() throws Exception {
        //输入文件 hdfs打开文件open
        FSDataInputStream fis  = fs.open(new Path("/128"));
        //输出文件 文件系统创建文件
        FileOutputStream fio  = new FileOutputStream(new File("/Users/mac/128.part1"));
        byte[] bs = new byte[1024];
        //读取第一个快
        for (int i = 0; i < 1024 * 128; i++) {
            fis.read(bs);
            fio.write(bs);
        }
        fio.close();
        fis.close();
    }

    @Test
    public  void testSeek2() throws Exception {
        //输入文件 hdfs打开文件open
        FSDataInputStream fis  = fs.open(new Path("/128"));
        //输出文件 文件系统创建文件
        FileOutputStream fio  = new FileOutputStream(new File("/Users/mac/128.pat2"));
        fis.seek(1024*1024*128);
        IOUtils.copyBytes(fis,fio,conf);
    }
}
