package day03.arrlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1.定义学生类
 * 2.创建集合对象
 * 3.键盘输入需要的数据
 * 4.创建学生对象
 * 5.往集合对象添加学生
 * 6.遍历集合对象
 */
public class demo02 {
    public static void main(String[] args) {
        //2.创建集合对象-指定类型为Stu2-类对象
        ArrayList<Stu2> a1 = new ArrayList<Stu2>();

        //添加3个学生
        addStu(a1);
        addStu(a1);
        addStu(a1);

        //遍历集合对象
        for (Stu2 s : a1) {
            //集合对象
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
    /**
     * 添加学生的方法
     *
     * @param arr
     */
    public static void addStu(ArrayList<Stu2> arr) {
        //3.键盘输入学生的姓名和年龄
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        //4.创建学生对象
        Stu2 s2 = new Stu2();
        s2.setName(name);
        s2.setAge(age);

        //5.往集合添加对象
        arr.add(s2);
    }
}
