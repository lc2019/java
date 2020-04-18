package day09.udp;

import java.io.IOException;
import java.net.*;

/**
 * public DatagramPacket(byte[] buf,
 * int length,
 * SocketAddress address)构造用于发送长度的分组的数据报包length指定主机上到指定的端口号。 length参数必须小于或等于buf.length 。
 * 参数
 * buf - 数据包数据。
 * length - 包长度。
 * address - 目的地址。
 */
public class fs {
    public static void main(String[] args) throws IOException {
        /**
         * 1.创建socket对象
         * 2.创建数据
         * 3.调用方法
         * 4.关闭
         */
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "hello wolrd,jiayou".getBytes();
        int len = bys.length;
        InetAddress addr = InetAddress.getByName("192.168.3.6");
        int port = 10086;
        //创建数据
        DatagramPacket dp = new DatagramPacket(bys, len, addr, port);

        //发送数据
        ds.send(dp);

        ds.close();
    }
}
