package day05.jiekouop;

/**
 * 接口不能直接实例化，需要实现类来实例化
 */
public class test {
    public static void main(String[] args) {
        jumpop jp = new jumpop();
        //接口不能直接实例化，需要实现类来实例化
        People p1 = new People(); //接口的实现类来实例化
        //多态调用方法
        jp.usejump(p1);

        //接口通过实现类初始化
        T t = jp.getjunp();
        t.jump();

        jp.usejump(new People() {
            @Override
            public void jump() {
                System.out.println("匿名内部类的使用");
            }
        });
    }
}
