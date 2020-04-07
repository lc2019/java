package day04.Constructor;

public class demo1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        Person person1 = new Person(18, "lc");
        person1.eat();

    }
}

class Person {
    int age;
    String name;

    //默认的构造器 初始化对象
    public Person() {
        System.out.println("构造器");
    }

    //自定义构造
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}