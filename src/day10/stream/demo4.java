package day10.stream;

import java.util.ArrayList;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lc");
        list.add("lu");
        list.add("雷超");
        list.add("路璐");
        list.add("lulu");
        list.add("lcc");
        list.add("lzc");

        list.stream().sorted().forEach(System.out::println);

        //按照姓名长度来排序,长度一样在继续排序
//        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach();
        list.stream().sorted((s1, s2) -> {
            int num = s1.length() - s2.length();
            int num2 = num == 0 ? s1.compareTo(s2) : num;
            return num2;
        }).forEach(System.out::println);
    }

}
