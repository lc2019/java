package pro1;

import java.util.ArrayList;
import java.util.Scanner;

public class Stum {
    /**
     * 1.输出语句完成菜单
     * 2.scanner
     * 3.switch
     */
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();

        while (true) {
            System.out.println("===欢迎来到学生管理系统===");
            System.out.println("    1.添加学生");
            System.out.println("    2.删除学生");
            System.out.println("    3.修改学生");
            System.out.println("    4.查看学生");
            System.out.println("    5.退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    addStu(arr);
                case "2":
                    delStu(arr);
                case "3":
                    modStu(arr);
                case "4":
                    showStu(arr);
                case "5":
                    System.exit(1);
            }
        }
    }

    //获取用户输入构造对象
    public static Student userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String sid = sc.nextLine();
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        String age = sc.nextLine();

        System.out.println("请输入居住地");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setSid(name);
        s.setSid(age);
        s.setSid(address);
        return s;

    }

    //添加学生
    public static void addStu(ArrayList<Student> arr) {
        Student s = userInput();
        arr.add(s);
        System.out.println("添加学生ok");
    }

    //删除学生
    public static void delStu(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入删除学生的id");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            //学术类的集合
            Student s = arr.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("不存在");
        } else {
            arr.remove(index);
            System.out.println("删除成功");
        }
    }

    public static void modStu(ArrayList<Student> arr) {
        Student s = userInput();

        for (int i = 0; i < arr.size(); i++) {
            Student s1 = arr.get(i);
            if (s1.getSid() == s.getSid()) {
                arr.set(i, s);
                break;
            }
        }
        System.out.println("修改成功");
    }

    public static void showStu(ArrayList<Student> arr) {
        if (arr.size() == 0) {
            System.out.println("meiy");
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s.getSid() + s.getName() + s.getAge() + s.getAddress());
        }
    }
}
