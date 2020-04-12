package day06.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class itr2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        //只有列表迭代器可以，普通的迭代器会抛出异常
        ListIterator<String> i1 = list.listIterator();
        while (i1.hasNext()) {
            String s = i1.next();
            if (s.equals("hello")) {
                i1.add("java");
            }
        }
        System.out.println(list);
    }
}
