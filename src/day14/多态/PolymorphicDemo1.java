package day14.多态;

/**
 * 多态的表现形式
 * 父类类型 对象名称=  new 子类构造器
 * 接口 对象名称 = new
 * <p>
 * 编译看左边 执行看右边
 * <p>
 * 变量的调用 编译看左边 运行看左边
 */
public class PolymorphicDemo1 {
    public static void main(String[] args) {
        /**
         * 多态
         */
        Animal a = new Cat();
        a.run();

        Dog d1 = new Dog();
        d1.run();
        System.out.println(d1.name);
    }

}

class Animal {
    public String name = "动物";

    public void run() {
        System.out.println("跑起来");
    }
}

class Dog extends Animal {
    public String name = "al";

    @Override
    public void run() {
        System.out.println("阿拉斯加 ooo");
    }
}

class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("走猫步");
    }
}