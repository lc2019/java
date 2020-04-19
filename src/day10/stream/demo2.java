package day10.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {
        //1.生成流，集合 数组
        ArrayList<String> list = new ArrayList<>();
        Stream<String> st1 = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> st2 = set.stream();

        //map生成流
        HashMap<String, Integer> map1 = new HashMap<>();
        Stream<String> st3 = map1.keySet().stream();
        Stream<Integer> st4 = map1.values().stream();

        //数组生成流
        String[] str = {"hello", "java", "bgidata"};
        Stream<String> st5 = Stream.of(str);

        Stream<String> st6 = Stream.of("hello", "goon", "2020");

        Stream<Integer> st7 = Stream.of(10, 20, 30);
    }
}
