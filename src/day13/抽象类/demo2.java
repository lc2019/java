package day13.抽象类;

/**
 * 抽象类的特征
 * 抽象类不能创建对象 可以有抽象方法
 * 提供构造器给子类使用
 * 派生类-体现模板思维-部分实现，部分抽象
 * 设计模式
 */
public class demo2 {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.write();
    }
}

/**
 * 设计模板
 */

abstract class Temp {
    private String name = "lc";
    private int age;

    //写作功能
    public void write() {
        System.out.println(name);
        System.out.println(code());
    }

    //抽象方法
    public abstract String code();
}

class Stu extends Temp {
    @Override
    public String code() {
        return "conding...";
    }
}
