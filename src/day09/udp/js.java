package day09.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class js {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bys = new byte[1024];

        //创建包对象
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        //接受数据包
        ds.receive(dp);

        //格式
//        byte[] data = dp.getData();
//        String  s = new String(data,0,data.length);
        System.out.println(new String(dp.getData(), 0, dp.getLength()));

        ds.close();
    }
}
