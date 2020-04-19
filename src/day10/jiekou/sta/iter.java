package day10.jiekou.sta;

public interface iter {
    void show();

    default void test() {
        System.out.println("默认方法");
    }

    //静态方法
    static void st() {
        System.out.println("静态方法");
    }
}
