package day06.map;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        //学生类hashmap集合对象，学生类作为key
        HashMap<student2, String> map = new HashMap<>();

        //创建学生类
        student2 st1 = new student2("lc", 20);
        student2 st2 = new student2("lzc", 28);
        student2 st3 = new student2("lcc", 21);
        student2 st4 = new student2("lcc", 21);

        //添加到map
        map.put(st1, "湖北");
        map.put(st2, "天门");
        map.put(st3, "西安");
        map.put(st4, "武汉");

        //遍历    
        for (student2 s :
                map.keySet()) {
            System.out.println(s.getName() + s.getAge() + map.get(s));
        }
    }
}
