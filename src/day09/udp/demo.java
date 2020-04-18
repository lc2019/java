package day09.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class demo {
    public static void main(String[] args) throws IOException {
        //1.创建socket对象
        DatagramSocket ds = new DatagramSocket();

        //2.按照数据格式创建数据 字节流 长度 IP 端口 从标准输入流读取
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            //3.数据转行
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.3.6"), 10086);

            //4.发送数据
            ds.send(dp);
            //5.关闭数据
        }
        ds.close();
    }
}
