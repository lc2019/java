package day04.mxdx;

import javax.crypto.spec.PSource;

/**
 * 继承 子类拥有父类的方法
 * 变量查找顺序-方法内-类成员-父类
 */
public class jc_01 {
    public int age;

    public void show() {
        System.out.println("父类的show方法");
    }
}

/**
 * 成员变量的访问
 * this访问本类的成员变量
 * super 访问父类的成员变量
 */
class jc_02 extends jc_01 {
    public static void main(String[] args) {
        jc_02 jc = new jc_02();
        jc.show();
        jc.test();


    }

    public String name;
    //this 访问本类的成员变量
    public int age = 30;

    public void test() {
        //方法内的变量
        int age = 20;
        System.out.println("test");
        //super 访问父类的成员变量
        System.out.println("test" + name + super.age);
        System.out.println("test" + this.age);
    }
}