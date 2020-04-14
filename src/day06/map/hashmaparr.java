package day06.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hashmaparr {
    public static void main(String[] args) {
        /**
         * 1.创建hashmap集合
         * 2.创建arrlist集合，添加元素
         * 3.把arrlist作为元素添加到hashmap
         * 4.遍历hashmap
         */
        //创建hashmap集合
        HashMap<String, ArrayList<String>> ma1 = new HashMap<>();
        //创建arrlist结合，并添加元素
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("2020");
        a1.add("jiayou");
        ma1.put("2020", a1);

        ArrayList<String> a2 = new ArrayList<>();
        a1.add("goon");
        a1.add("jiayou");
        ma1.put("jinnian", a2);

        //获取所有的key--遍历hashmap
        Set<String> s1 = ma1.keySet();
        for (String s :
                s1) {
            //通过key得到值
            ArrayList<String> arr = ma1.get(s);
            for (String s2 :
                    arr) {
                System.out.println(s2);
            }
        }
    }
}

