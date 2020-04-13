package day06.hashset;

import java.util.HashSet;

/*
    定义学生类
    创建hashset集合
    创建学生对象
    把学生添加到集合
    遍历集合foreach
 */
public class test {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<student> s1 = new HashSet<>();

        //创建学生类
        student st1 = new student("lc", 18);
        student st2 = new student("ll", 19);
        student st3 = new student("lzc", 28);
        student st4 = new student("lc", 18);

        //添加学生类到集合
        s1.add(st1);
        s1.add(st2);
        s1.add(st3);
        s1.add(st4);

        for (student s :
                s1) {

            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
