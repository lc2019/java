package day13.接口;


/**
 * 接口方法
 */
public interface I3 {
    /**
     * 实例方法
     */
    default void run() {
        System.out.println("接口的实例方法");
    }

    /**
     * 静态方法只能被本身调用
     */
    static void go() {
        System.out.println("接口的静态方法");
    }
}
