package day09.stdtcp;

import java.io.*;
import java.net.Socket;

public class fs {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket st = new Socket("192.168.3.6", 10001);
        //接受键盘输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            //写入
            bw.write(line);
            //换行
            bw.newLine();
            bw.flush();
        }
        st.close();
    }
}
