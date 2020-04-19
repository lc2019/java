package day10.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 收集方法
 * public static <T> Collector<T,?,List<T>> toList()返回一个Collector ，它将输入元素List到一个新的List 。 List返回的类型，可变性，可序列化或线程安全性没有List ; 如果需要对返回的List进行更多的控制，请使用toCollection(Supplier) 。
 * 参数类型
 * T - 输入元素的类型
 * 结果
 * 一个 Collector ，它将所有输入元素收集到一个 List中，按照顺序
 */
public class demo8 {
    public static void main(String[] args) {
        ArrayList<String> wlist = new ArrayList<>();
        wlist.add("张曼玉");
        wlist.add("刘亦菲");
        wlist.add("林青霞");
        wlist.add("迪丽热巴");
        wlist.add("古力娜扎");

        Stream<String> st1 = wlist.stream().filter(s -> s.length() == 3);
        List<String> names = st1.collect(Collectors.toList());
        for (String name : names) {
            System.out.println(name);
        }

        HashSet<Integer> is1 = new HashSet<>();
        is1.add(10);
        is1.add(20);
        is1.add(30);
        is1.add(40);
        is1.add(50);

        Stream<Integer> st2 = is1.stream().filter(age -> age > 20);
        Set<Integer> i1 = st2.collect(Collectors.toSet());
        for (Integer i :
                i1) {
            System.out.println(i);
        }

        //数组获取流
        String[] arr = {"张曼玉,28", "刘亦菲,18", "迪丽热巴,15", "古力娜扎,21", "林青霞,20"};
        Stream<String> age = Stream.of(arr).filter(s -> Integer.parseInt(s.split(",")[1]) > 20);
        System.out.println("==========");
        //组成新的流-tomap用来构造流 String，int
        Map<String, Integer> m1 = age.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> ss = m1.keySet();
        for (String s :
                ss) {
            Integer v = m1.get(s);
            System.out.println(s + "," + v);
        }

    }
}
