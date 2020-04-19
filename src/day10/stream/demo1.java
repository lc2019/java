package day10.stream;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();
        arl.add("lc");
        arl.add("2020");
        arl.add("java");
        arl.add("ll");

        ArrayList<String> arr2 = new ArrayList<>();

        for (String s :
                arl) {
            arr2.add(s);
        }

        for (String s1 :
                arr2) {
            System.out.println(s1);
        }

        //改进
        //生成流，过滤l开头 长度是2的 然后打印
        arl.stream().filter(s -> s.startsWith("l")).filter(s -> s.length() == 2).forEach(System.out::println);
    }
}
