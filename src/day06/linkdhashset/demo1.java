package day06.linkdhashset;

import java.util.LinkedHashSet;

public class demo1 {
    public static void main(String[] args) {
        LinkedHashSet<String> s1 = new LinkedHashSet<>();
        s1.add("hello");
        s1.add("wolrd");
        s1.add("javase");
        s1.add("javaee");
        s1.add("javaee");

        //遍历
        for (String s :
                s1) {
            System.out.println(s);
        }
    }
}
