package day10.jiekou;

public interface it1 {
    void show();

    void test();

    //不需要重写
    public default void test2() {
        System.out.println("接口的方法");
    }
}
