package day03.arrlist;

import java.util.ArrayList;

/**
 * 集合配合类的使用
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //创建学生类的集合对象
        ArrayList<Student> arr = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("lc", 18);
        Student s2 = new Student("ll", 19);
        Student s3 = new Student("lzc", 28);

        //添加学生对象到集合
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        //遍历
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s.getName() + "." + s.getAge());
        }
    }
}
