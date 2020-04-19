package day10.hanshujiekou;

import java.util.function.Supplier;

public class supplier {

    //
//    @FunctionalInterface
//    public interface Supplier<T>代表结果供应商。
//    没有要求每次调用供应商时都会返回新的或不同的结果。
    public static void main(String[] args) {
        String ss = getstr(() -> "lc");
        System.out.println(ss);

        Integer anInt = getInt(() -> 20);
        System.out.println(anInt);
    }

    public static String getstr(Supplier<String> s) {
        return s.get();
    }

    public static Integer getInt(Supplier<Integer> s) {
        return s.get();
    }
}
