package day06.jiheCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testpx {
    public static void main(String[] args) {
        /**
         * 1.创建学生类
         * 2.创建arrlist集合对象
         * 3.创建学生对象
         * 4.把学生添加到集合
         * 5.使用collarrlist集合排序 按照年龄从小到打 年龄相同按照姓名
         * 6.遍历集合
         */

        //创建arr集合对象
        ArrayList<Stu> stus = new ArrayList<>();

        //创建学生对象
        Stu s1 = new Stu("lzc", 18);
        Stu s2 = new Stu("lc", 28);
        Stu s3 = new Stu("lcc", 19);
        Stu s4 = new Stu("ll", 20);

        //把学生添加到集合
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        /**
         * 比较器，匿名内部类
         */
        Collections.sort(stus, new Comparator<Stu>() {
            @Override
            public int compare(Stu s1, Stu s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        for (Stu s :
                stus) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
