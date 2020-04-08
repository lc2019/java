package pro1;

import java.util.ArrayList;
import java.util.Scanner;

/*
学生管理系统
 */
public class StuManager {
    /**
     * 1.输出语句完成主界面菜单的编写
     * 2.scanner来获取用户输入
     * 3.swtich来完成操作
     * 4.菜单循环
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建集合对象，存储学生数据
        ArrayList<Student> arr = new ArrayList<>();

        while (true) {
            System.out.println("===欢迎来到学生管理系统===");
            System.out.println("    1.添加学生");
            System.out.println("    2.删除学生");
            System.out.println("    3.修改学生");
            System.out.println("    4.查看学生");
            System.out.println("    5.退出");
            System.out.println("请输入你的选择：");

            //2.Scanner来实现键盘输入
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStu(arr);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    delStu(arr);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    modStu(arr);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    showStu(arr);
                    break;
                case "5":
//                    System.out.println("退出");
                    System.exit(0);
            }
        }
    }

    /**
     * 添加学生的方法，把学生添加到集合
     * 是一个集合，把用户输入给学生对象
     */
    public static void addStu(ArrayList<Student> arr) {
        //用户输入构成学生的对象
        Student s = userInput();
        //将学生对象添加到集合
        arr.add(s);
        System.out.println("添加学生成功");

    }

    /**
     * 展示学生
     *
     * @param arr
     */
    public static void showStu(ArrayList<Student> arr) {
        if (arr.size() == 0) {
            System.out.println("没有学生");
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            //这里集合里面是对象
            Student s = arr.get(i);
            System.out.println(s.getSid() + s.getName() + s.getAge() + s.getAddress());
        }
    }

    /**
     * 删除学生
     *
     * @param arr
     */
    public static void delStu(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生的id：");
        String sid = sc.nextLine();

        //遍历集合从学生对象集合删除
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }

            if (index == -1) {
                System.out.println("学号不存在");
            } else {
                arr.remove(index);
                System.out.println("删除成功");
            }
        }
        System.out.println("删除学生成功");
    }

    public static void modStu(ArrayList<Student> arr) {
        //用户输入构成学生的对象
        Student s = userInput();

        //遍历几个修改学生对应的信息
        for (int i = 0; i < arr.size(); i++) {
            Student s1 = arr.get(i);
            if (s1.getSid() == s.getSid()) {
                arr.set(i, s);
                break;
            }
        }
        System.out.println("修改成功");
    }

    /**
     * 学生输入的信息构成学生对象
     *
     * @return
     */
    public static Student userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生的居住地：");
        String address = sc.nextLine();

        //创建1个学生对象接受用户的输入,初始化对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        return s;
    }

    public static boolean isUsed(ArrayList<Student> arr, String sid) {
        boolean flag = false;
        for (int i = 0; i < arr.size(); i++) {
            Student s1 = arr.get(i);
            if (s1.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
