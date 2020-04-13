package day06.treeset;

import java.util.TreeSet;

/*
按照一定的规则进行排序
 */
public class demo1 {
    public static void main(String[] args) {
        //根据构造方法的不同，排序规则也不同
        TreeSet<Integer> i1 = new TreeSet<>();

        i1.add(1);
        i1.add(12);
        i1.add(30);
        i1.add(20);

        for (Integer i :
                i1) {
            System.out.println(i);
        }
    }
}
