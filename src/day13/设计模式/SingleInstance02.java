package day13.设计模式;

/**
 * 通过类获取单例对象的时候，发现没有对象，创建的时候在创建
 * 1.定义1个单例类
 * 2.把类的构造器私有化
 * 3.定义1个静态变量存储对象
 * 4.获取对象的方法
 */

public class SingleInstance02 {
    public static void main(String[] args) {
        SingleIns02 s1 = SingleIns02.getIns();
        SingleIns02 s2 = SingleIns02.getIns();
        System.out.println(s1 == s2);

    }
}

//懒汉单列模式，只能有一个对象
class SingleIns02 {
    /**
     * 构造器私有
     */
    private SingleIns02() {
    }

    //类型为对象,懒汉式 对象需要的时候创建
    public static SingleIns02 ins;

    //提供get的方法
    public static SingleIns02 getIns() {
        if (ins == null) {
            ins = new SingleIns02();
        }
        return ins;
    }
}
