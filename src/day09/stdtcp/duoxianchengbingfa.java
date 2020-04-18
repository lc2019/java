package day09.stdtcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class duoxianchengbingfa {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);


        while (true) {
            //一直监听
            Socket sa = ss.accept();
            //线程启动
            new Thread(new SerThread(sa)).start();
        }

    }
}
