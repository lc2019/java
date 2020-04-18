package day09.stdtcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class js {
    public static void main(String[] args) throws IOException {
        //创建服务端对象
        ServerSocket skt = new ServerSocket(10001);
        //监听客户端链接 返回对象
        Socket st = skt.accept();

        //获取输入流
//        InputStream ins  = st.getInputStream();
//        InputStreamReader isr  = new InputStreamReader(ins);
//        BufferedReader br  = new BufferedReader(isr);
        //包装类
        BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        skt.close();

    }
}
