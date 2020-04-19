package day10.stream;

import java.util.ArrayList;

/**
 * 流创建
 * 流的操作
 * 流的终结
 */
public class demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //字符串转为int
        list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        //应用方法
        list.stream().map(Integer::parseInt).forEach(System.out::println);

        //返回一个IntStream ，其中包含将给定函数应用于此流的元素的结果。
//        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
