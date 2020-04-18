package day09.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器的要求
 */
public class server {
    public static void main(String[] args) throws IOException {
        //1.创建服务器socket对象 serversocket
        ServerSocket skt = new ServerSocket(10086);

        //2.监听客户端链接，返回socket对象
        Socket st = skt.accept();

        //3.获取客户端输入流，读数据，显示数据
        InputStream ins = st.getInputStream();
        byte[] bys = new byte[1024];
        int len = ins.read(bys);
        System.out.println(new String(bys, 0, len));

        //4.返回消息给客户端
        OutputStream os = st.getOutputStream();
        os.write("数据已收到".getBytes());

        skt.close();
    }
}
