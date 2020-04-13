package day06.map;

import java.util.HashMap;

public class demo2 {
    public static void main(String[] args) {
        //学生类hashmap集合对象
        HashMap<String, student> s1 = new HashMap<>();

        student st1 = new student("lc", 20);
        student st2 = new student("lzc", 28);
        student st3 = new student("lcc", 21);

        s1.put("01", st1);
        s1.put("02", st2);
        s1.put("03", st3);

        for (String k :
                s1.keySet()) {
            System.out.println(k + "," + s1.get(k).getName() + s1.get(k).getAge());
        }

    }
}
