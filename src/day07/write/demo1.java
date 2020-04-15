package day07.write;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 追加 true
 * 换行
 * /r/n windows
 * /r mac
 * /n linux
 */
public class demo1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("demo1.txt", true);

        //写入
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());
        }

        fos.close();
    }
}
