package day07.bufferrw;

import java.io.*;

public class dmeo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("demo5.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("demo6.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
