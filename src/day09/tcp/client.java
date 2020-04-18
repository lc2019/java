package day09.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * client
 */
public class client {
    public static void main(String[] args) throws IOException {
        //1.创建客户端socket对象  主机和端口
        Socket sk = new Socket("192.168.3.6", 10086);

        //2.获取客户端输出流
        OutputStream os = sk.getOutputStream();
        //3.写入要输出的数据
        os.write("tcp 网络编程".getBytes());

        //4.接受服务端的反馈
        InputStream ins = sk.getInputStream();
        //格式 字节流
        byte[] bys = new byte[1024];
        //读取
        int len = ins.read(bys);
        System.out.println("client的消息：" + new String(bys, 0, len));

        //关闭流
        sk.close();

    }
}
