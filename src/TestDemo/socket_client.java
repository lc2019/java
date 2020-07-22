package TestDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class socket_client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10000);
        OutputStream os = s.getOutputStream();
        os.write("hello，TCP,我来了".getBytes());
        s.close();
    }
}
