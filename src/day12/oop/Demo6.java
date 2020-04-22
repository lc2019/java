package day12.oop;

/**
 * 继承的特点：
 * 1.单继承 语法的二义性（歧义）
 * 2.多层继承  一个类可以间接继承多个类
 * 3.Object类
 * 引用数据类型
 * 作为参数和返回值
 */
public class Demo6 {
    public static void main(String[] args) {
        Dog erha = new Dog();
        go(erha);

        Dog d2 = Create();
        d2.run();
    }

    public static void go(Dog d) {
        System.out.println("比赛了");
        d.run();
    }

    //引用类型作为方法的返回值
    public static Dog Create() {
//        Dog d1 = new Dog();
//        return d1;
        return new Dog();
    }
}

class Dog {
    public void run() {
        System.out.println("🐕跑起来");
    }
}