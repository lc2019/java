package day06.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class forplus3 {
    public static void main(String[] args) {
        //实现迭代器接口的类允许对象成为增强型
        int[] arr = {12, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("2020");
        list.add("java");
        list.add("goon");
        list.add("bigdata");
        //方法1
        for (String s : list) {
            System.out.println(s);
        }

        //方法2
        Iterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
        }
    }
}
