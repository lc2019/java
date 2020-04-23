package day13.接口;

/**
 * 接口实现,必须全部实现抽象方法
 * 实现类
 */
public class InterImplements implements I1, I2 {
    private String name;

    public InterImplements(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "跑起来，gogoggo，在路上");
    }

    @Override
    public void code() {
        System.out.println(name + "coding....");
    }

    @Override
    public void sleep() {
        System.out.println(name + "准时睡觉");
    }
}
