package day13.接口;

public class demo3 {
    public static void main(String[] args) {
        A a = new A();
        //调用类的方法
        a.test();
    }
}

/**
 *
 */
class A {
    public void test() {
        System.out.println("A");
    }
}

interface B {
    default void test() {
        System.out.println("B");
    }
}

class D extends A implements B {

}