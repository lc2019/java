package day13.设计模式;

/**
 * 通过类获取单例对象的时候，对象已经提前创建好
 * 1.定义1个单例类
 * 2.把类的构造器私有化
 * 3.定义1个静态变量存储对象
 * 4.获取对象的方法
 */

public class SingleInstance {
    public static void main(String[] args) {
        SingleIns s1 = SingleIns.getIns();
        SingleIns s2 = SingleIns.getIns();
        System.out.println(s1 == s2);

    }
}

//单列模式，只能有一个对象
class SingleIns {
    /**
     * 构造器私有
     */
    private SingleIns() {
    }

    //类型为对象,饿汉式 对象已经提前创建好
    private static SingleIns ins = new SingleIns();

    //提供get的方法
    public static SingleIns getIns() {
        return ins;
    }
}
