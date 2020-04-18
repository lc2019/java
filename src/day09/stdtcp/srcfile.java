package day09.stdtcp;

import java.io.*;
import java.net.Socket;

/**
 * 数据来源文本
 */
public class srcfile {
    public static void main(String[] args) throws IOException {
        //客户端对象
        Socket skt = new Socket("192.168.3.6", 10001);

        //来源文件
        BufferedReader br = new BufferedReader(new FileReader("demo1.txt"));
        //写入流传输
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(skt.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //通知服务端写入完成
        skt.shutdownOutput();

        //接受服务端的反馈
        BufferedReader brc = new BufferedReader(new InputStreamReader(skt.getInputStream()));
        //读取
        String s = brc.readLine();
        System.out.println("服务器信息" + s);

        //关闭流
        br.close();
        skt.close();
    }
}
