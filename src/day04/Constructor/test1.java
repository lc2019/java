package day04.Constructor;

/*
    都会调用父类的无参构造
 */
public class test1 {
    public static void main(String[] args) {

        boy b1 = new boy();

        boy b2 = new boy(20);
        //优先调用子类的，如果子类没有去父类查找
        b1.eat();
    }
}
