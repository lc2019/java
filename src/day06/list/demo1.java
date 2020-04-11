package day06.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("2020");
        list.add("java");
        list.add("goon");
        list.add("bigdata");
        list.add(1, "jianchi");
        System.out.println(list.set(0, "jianchi"));
        System.out.println(list.get(0));

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
