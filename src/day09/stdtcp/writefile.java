package day09.stdtcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class writefile {
    public static void main(String[] args) throws IOException {
        ServerSocket skt = new ServerSocket(10001);
        Socket sa = skt.accept();

        //接受数据
        BufferedReader br = new BufferedReader(new InputStreamReader(sa.getInputStream()));
        //写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("tcp.txt"));

        //发送数据
        String line;
        while ((line = br.readLine()) != null) {//等待读取数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //反馈消息
        BufferedWriter up = new BufferedWriter(new OutputStreamWriter(sa.getOutputStream()));
        up.write("复制ok");
        up.newLine();
        up.flush();

        //关闭流
        bw.close();
        skt.close();

    }
}
