package day09.stdtcp;

import java.io.*;
import java.net.Socket;

public class SerThread implements Runnable {
    private Socket s;

    public SerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {

        //接受数据写入到文本
        try {
            //读取流
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int count = 0;
            File fs = new File("[" + count + "].txt");
            while (fs.exists()) {
                count++;
                fs = new File("[" + count + "].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(fs));
            //写入文件
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //反馈
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bfw.write("ok");
            bfw.newLine();
            bfw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
