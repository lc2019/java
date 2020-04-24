package day14.内部类;

/**
 * 匿名内部类也是一个对象
 */
public class Anonymity {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("坚持。。。。。。");
            }
        };
        a.run();
        a.go();
    }
}


abstract class Animal {
    public abstract void run();

    public void go() {
        System.out.println("java gogogo");
    }
}