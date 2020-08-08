package day05.jicheng.动物园;

/**
 * 多态
 * 父类的引用指向子类对象
 * 接口的引用遵从接口的类对象
 */

public class test {
    public static void main(String[] args) {
        Animals animals = new Animals();
        //传入animal对象
        feed(animals);
        //dog对象 animal的子类
        feed(new Dog());
    }

    public static void feed(Animals a) {
        System.out.println(a.getClass() + "chifanl");
    }
}
