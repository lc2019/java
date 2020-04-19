package day10.predicate;

import java.util.function.Predicate;

public class demo2 {
    public static void main(String[] args) {
        boolean b1 = pkstr("hello", s -> s.length() > 8);
        boolean b2 = pkstr("hello world java", s -> s.length() > 8);
        System.out.println(b1);
        System.out.println(b2);
        /**
         * 2个判断条件
         * pkstr(String s, Predicate<String> pre1,Predicate<String> pre2)
         * return pre1.and(pre2).test(s)
         */
        boolean b3 = pkstr("hello", s -> s.length() > 8, s -> s.length() < 10);
        boolean b4 = pkstr("hello java ", s -> s.length() > 8, s -> s.length() < 20);
        System.out.println(b3);
        System.out.println(b4);
    }

    public static boolean pkstr(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static boolean pkstr(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre1.test(s);
//        boolean b3 = b1&&b2;
//        return b3;
        return pre1.and(pre2).test(s);
    }
}
