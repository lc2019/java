package day07.iojihe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class arrio {
    public static void main(String[] args) throws IOException {
        ArrayList<stu> arr = new ArrayList<>();

        stu s1 = new stu("01", "lc", 18, "tianmen");
        stu s2 = new stu("02", "ll", 19, "tianmen");
        stu s3 = new stu("03", "lzc", 18, "tianmen");

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        BufferedWriter bw = new BufferedWriter(new FileWriter("demo4.txt"));


        for (stu s :
                arr) {

            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
