package day10.stream;

import java.util.ArrayList;

public class demo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lc");
        list.add("lu");
        list.add("雷超");
        list.add("路璐");
        list.add("lulu");
        list.add("lcc");
        list.add("lzc");

        long i = list.stream().filter(s -> s.startsWith("l")).count();
        System.out.println(i);
    }
}
