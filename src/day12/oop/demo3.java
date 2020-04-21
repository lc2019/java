package day12.oop;

import javax.crypto.spec.PSource;

/**
 * 继承
 */
public class demo3 {
    public static void main(String[] args) {
        //继承
        cat c1 = new cat();
        c1.run();
        c1.go();

        //共享父类的静态方法
        cat.test();

        //直接取父类查找
        System.out.println(c1.name);
    }
}

class cat extends Animal {
    //成员变量的就近原则
    public String name = "子类名称";

    public void go() {
        //强制调用父类的变量
        System.out.println(super.name);
    }
}

class Animal {
    public String name = "父类名称";

    //静态 默认只有一份 但是可以被共享
    public static void test() {

    }

    //实例可以继承
    public void run() {

    }

    private String age;
}