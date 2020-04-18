package day09.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * tcp发送数据
 * 创建客户端socket
 * 获取输出流，写数据
 * 释放资源
 */
public class fs {
    public static void main(String[] args) throws IOException {
        Socket soc = new Socket("192.168.3.6", 10086);

        //获取输出流
        OutputStream os = soc.getOutputStream();
        //写入
        os.write("nihao".getBytes());
        //关闭流
        os.close();
    }
}
