package day04.Constructor;

public class boy extends Person {
    public int age;

    public boy() {
        System.out.println("子类的无参构造");
    }

    public boy(int age) {
        //调用父类的有参构造
        super(29);
//        super();
        System.out.println("子类的有参构造" + age);
    }

    public void eat() {
//        super.eat();调用父类的eat方法
        System.out.println("zi类：吃饭");
    }
}
