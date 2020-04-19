package day10.hanshujiekou;

import java.util.function.Function;

/**
 * 字符串操作
 * 字符串切分
 * 字符串转为int
 * int+70 然后输出
 */
public class demo4 {
    public static void main(String[] args) {
        String str = "leic,20";

        //Function<String,String> fun1,Function<String,Integer> fun2
        getage(str, s -> s.split(",")[1], s -> Integer.valueOf(s) + 70);
        getage(str, s -> s.split(",")[1], Integer::parseInt);

        //Function<String, Integer> fun1, Function<Integer, String> fun2
        //getage(str,s->Integer.parseInt(s.split(",")[1]),s-> String.valueOf(s+70));

        //返回int
        System.out.println(Integer.valueOf(100));
        //返回字符串
        System.out.println(Integer.parseInt("100"));

    }

    /**
     * @param s    字符串
     * @param fun1 字符串2个
     * @param fun2 字符串转为int
     */
    private static void getage(String s, Function<String, String> fun1, Function<String, Integer> fun2) {
        int i = fun1.andThen(fun2).apply(s);
        System.out.println(i);
    }
}
