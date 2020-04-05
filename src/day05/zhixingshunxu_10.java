package day05;

class Demo {
    static Demo d1 = new Demo();
    static Demo d2 = new Demo();

    static {
        System.out.println("静态代码块");
    }

    { //1.只要执行构造方法就会执行构造代码块
        System.out.println("构造代码块");
    }

    public Demo() {
        System.out.println("构造方法");
    }

}

public class zhixingshunxu_10 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        /*
        d1
        构造代码块
        构造方法

        d2
        构造代码块
        构造方法

        staic代码块
        静态代码块

        构造代码块
        构造方法
         */
    }
}
