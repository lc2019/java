package day12.oop;

/**
 * 方法重写
 * supper调用父类被重写的方法
 * 父类的私有方法不能被重写
 * 静态方法也不能重写
 */
public class Demo4 {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.run();
        w.go();

    }

}

class Animals {
    public void run() {
        System.out.println("父类跑起来了");
    }
}

class Wolf extends Animals {
    /**
     * 如果方法名相同根据就近原则，会优先调用就近的方法，所以不会调用到父类的方法
     */

    @Override
    public void run() {
        super.run(); //调用父类的方法
        System.out.println("子类跑起来了");
    }

    public void go() {
        super.run(); //调用父类的方法
    }
}