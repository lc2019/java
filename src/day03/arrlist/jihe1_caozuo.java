package day03.arrlist;

import java.util.ArrayList;

/**
 * 集合
 */
public class jihe1_caozuo {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        //添加元素
        System.out.println(strs.add("abc"));//bool
        System.out.println(strs.add("def"));//bool
        System.out.println(strs.add("mnb"));//bool
        System.out.println(strs);
        //指定位置添加元素
        strs.add(0, "123");
        System.out.println(strs);

        //删除
        System.out.println(strs.remove("123"));//bool

        //g恩据索引来删除元素，返回删除的元素
        System.out.println(strs.remove(0));

        //用指定的元素替换此列表中指定位置的元素。,返回被替换的元素
        System.out.println(strs.set(0, "abc"));

        System.out.println(strs.get(1)); //根据索引获取元素

        //集合的大小
        System.out.println(strs.size());


    }
}
