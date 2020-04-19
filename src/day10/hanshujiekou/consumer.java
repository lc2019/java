package day10.hanshujiekou;

import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        //s是形参 类型是string
        opstr("lc", s -> System.out.println(new StringBuilder(s).reverse().toString()));
        opstr("lc", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse().toString()));

    }

    public static void opstr(String name, Consumer<String> cons) {
        cons.accept(name);
    }

    //消费2次name
    public static void opstr(String name, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(name);
    }
}
