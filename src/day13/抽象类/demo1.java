package day13.抽象类;

/**
 * abs修饰的没有方法体的方法
 */
public class demo1 {
    public static void main(String[] args) {
        Eng e1 = new Eng();
        e1.work();
    }
}

class Eng extends Emp {
    @Override
    public void work() {
        System.out.println("code。。。");
    }
}

class Teac extends Emp {
    /**
     * 重写抽象方法
     */
    @Override
    public void work() {
        System.out.println("教书");
    }
}

abstract class Emp {
    //子类必须要重写的方法
    public abstract void work();
}