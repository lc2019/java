package day17.线程通信.生产消费者;

/**
 * 线程通信
 */
public class thread1 {
    public static void main(String[] args) {
        account acc = new account("icbc-1", 0);

        //消费线程
        new xf(acc, "小明").start();
        new xf(acc, "小白").start();

        //存钱线程
        new sc(acc, "父亲").start();
        new sc(acc, "母亲").start();

    }
}
