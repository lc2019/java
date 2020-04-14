package day06.jiheCollection;

import java.util.ArrayList;
import java.util.Collections;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(70);
        list.add(30);
        list.add(20);

        System.out.println(list);

        //反转
        Collections.reverse(list);
        System.out.println(list);

    }
}
