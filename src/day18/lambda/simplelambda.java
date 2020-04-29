package day18.lambda;

/**
 * 简化规则：
 * 1.只有1行代码 可以省略大括号不写，同时省略分号
 * 2.只有1行代码大括号省略
 * 3.参数类型省略
 * 4.只有1个参数，类型可以省略，（）也可以省略
 */
public class simplelambda {
    public static void main(String[] args) {
        //简化
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
