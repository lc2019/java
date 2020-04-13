package day06.hashset;

import netscape.security.UserTarget;

import java.util.HashSet;

public class demo1 {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();

        s1.add("hello");
        s1.add("hello1");
        s1.add("hello2");
        s1.add("world");
        s1.add("world");

        for (String s :
                s1) {
            System.out.println(s);
        }

        System.out.println("你好".hashCode());
        System.out.println("你呢".hashCode());
    }
}
