package day10.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 流的生成
 * 流的操作
 */
public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lc");
        list.add("lu");
        list.add("雷超");
        list.add("路璐");
        list.add("lulu");
        list.add("lcc");
        list.add("lzc");

        list.stream().filter(s -> s.startsWith("l")).filter(s -> s.length() < 5).forEach(System.out::println);
        list.stream().filter(s -> s.startsWith("雷")).filter(s -> s.length() == 2).forEach(System.out::println);

        System.out.println("==============分界线");
        //取前3个
        list.stream().limit(3).forEach(System.out::println);
        //跳过3个
        list.stream().skip(3).forEach(System.out::println);

        //跳过2个,取前2个
        list.stream().skip(2).limit(2).forEach(System.out::println);

        System.out.println("========");
        //
        Stream<String> s1 = list.stream().limit(4);
        Stream<String> s2 = list.stream().skip(2);
        //静态方法组合concat，去除重复的distinct
        Stream.concat(s1, s2).distinct().forEach(System.out::println);
    }
}
