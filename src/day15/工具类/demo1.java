package day15.工具类;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        //批量添加元素
        Collections.addAll(s1, "lc", "ll", "2020", "dashuju");

        //打乱顺序
        Collections.shuffle(s1);
        System.out.println(s1);

        ArrayList<Integer> itr = new ArrayList<>();
        itr.add(100);
        itr.add(109);
        itr.add(108);
        itr.add(110);
        //排序
        Collections.sort(itr);
        System.out.println(itr);
    }
}
