package day07.copyfile;

import java.io.*;

public class copyp {
    public static void main(String[] args) throws IOException {
        //创建字符输入对象
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("demo1.txt"));
//        String line;
//        //读取结束返回null
//        while ((line=br.readLine())!=null){
//            //1写入
//            bw.write(line);
//            //2换行
//            bw.newLine();
//            //3刷新
//            bw.flush();
//        }
//
//        bw.close();
//        br.close();

        /**
         * 字符打印流实现文件复制
         */
        PrintWriter pw = new PrintWriter(new FileWriter("demo2.txt"));
        String line;
        //读取结束返回null
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }

        pw.close();
        br.close();
    }
}
