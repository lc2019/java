package day03.arrlist;

import java.util.ArrayList;

public class jihe2_bl {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("123");
        s1.add("456");
        s1.add("789");

        //get方法
        for (int i = 0; i < s1.size(); i++) {
            System.out.println(s1.get(i));
            String s = s1.get(i);
        }

    }
}
