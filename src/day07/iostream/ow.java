package day07.iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流的写入
 */
public class ow {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter o1 = new OutputStreamWriter(new FileOutputStream("demo2.txt"));
        o1.write("中国");
        o1.close();
    }
}
