package day04.Constructor;

public class Person {
    int age;

    //默认的构造器 初始化对象
    public Person() {
        System.out.println("父类构造器");
    }

    public Person(int age) {
        System.out.println("父类的有参构造器" + age);
    }

    public void eat() {
        System.out.println("父类：吃饭");
    }
}