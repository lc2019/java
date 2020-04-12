package day06.list;

import java.util.LinkedList;

public class linklist {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("hello");
        link.add("hello1");
        link.add("hello2");
        link.add("hello3");

        link.addFirst("javase");
        link.addLast("2020");

        System.out.println(link);
        //获取第一个元素
        System.out.println(link.getFirst());
        //获取最后1个元素
        System.out.println(link.getLast());
    }
}
