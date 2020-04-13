package day06.comparator;
/**
 * 使用带参构造方法使用的是比较器排序对元素进行排序
 * 比较器排序 就是让构造方法接受comparator的实现类对象 重写compare的方法
 * 排序规则按照要求的主要条件和次元条件来写
 */

import java.util.Comparator;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        //传递带参的构造方法，匿名内部类
        TreeSet<student> ss = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                //this.age = s.age
                //s1,s2
//                int num = s1.getAge() - s2.getAge();
                int num = s2.getAge() - s1.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        student st1 = new student("lc", 18);
        student st2 = new student("ll", 17);
        student st3 = new student("lzc", 28);
        student st4 = new student("lcc", 21);
        student st5 = new student("lulu", 21);
        student st6 = new student("lulu", 21);
        ss.add(st1);
        ss.add(st2);
        ss.add(st3);
        ss.add(st4);
        ss.add(st5);
        ss.add(st6);

        //Comparable 自然排序
        for (student s :
                ss) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
