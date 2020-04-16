package day07.iojihe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ioarr {
    public static void main(String[] args) throws IOException {
        //io
        BufferedReader br = new BufferedReader(new FileReader("demo4.txt"));
        //集合
        ArrayList<stu> arr = new ArrayList<>();

        String line;
        //读取
        while ((line = br.readLine()) != null) {
            String[] sp = line.split(",");
            stu s = new stu();
            //构建学术类对象
            s.setSid(sp[0]);
            s.setName(sp[1]);
            s.setAge(Integer.parseInt(sp[2]));
            //添加对象到集合
            arr.add(s);
        }
        br.close();

        for (stu ss : arr) {
            System.out.println(ss.getSid() + "," + ss.getName() + "," + ss.getAge());
        }
    }
}

