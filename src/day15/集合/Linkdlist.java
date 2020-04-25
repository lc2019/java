package day15.集合;

import java.util.LinkedList;

/**
 * 链表 操作首位元素最快
 * 站和队列的相关功能
 */
public class Linkdlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("lc1");
        list.add("lc2");
        list.add("lc3");
        list.add("lc4");
        list.add("lc5");

        //获取首尾元素
        list.getFirst();
        list.getLast();
        System.out.println(list.pop());
    }
}
