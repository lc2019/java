package day09.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 接受数据
 */
public class js {
    public static void main(String[] args) throws IOException {
        ServerSocket js = new ServerSocket(10086);
        //客户端的链接监听
        Socket s = js.accept();

        //获取输入流
        InputStream ins = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = ins.read(bys);
        System.out.println(new String(bys, 0, len));

        s.close();
        js.close();
    }
}
