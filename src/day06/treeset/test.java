package day06.treeset;

import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<student> ss = new TreeSet<>();

        student st1 = new student("lc", 18);
        student st2 = new student("ll", 19);
        student st3 = new student("lzc", 28);
        student st4 = new student("lcc", 21);
        student st5 = new student("lulu", 21);
        student st6 = new student("lulu", 21);

        ss.add(st1);
        ss.add(st2);
        ss.add(st3);
        ss.add(st4);
        ss.add(st5);
        ss.add(st6);

        //Comparable 自然排序
        for (student s :
                ss) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
