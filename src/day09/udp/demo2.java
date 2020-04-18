package day09.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class demo2 {
    public static void main(String[] args) throws IOException {
        //接受数据
        DatagramSocket ds = new DatagramSocket(10086);
        while (true) {
            //数据长度
            byte[] bys = new byte[1024];
            //数据对象
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //接受方法
            ds.receive(dp);
            //数据格式化输出
            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
    }
}
