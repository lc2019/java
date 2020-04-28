package day17.thread.pro1;

/**
 * 多个线程同时操作可能出现线程安全问题
 * 锁机制：
 * 同步代码块
 * 同步方法 每次只能允许一个线程进入
 * lock显示锁
 * 锁对象-访问共享资源的核心代码
 */
public class secthread {
    public static void main(String[] args) {
        //初始化账户和余额
        account ac = new account("123", 10000);

        getAcc g1 = new getAcc(ac, "th1");
        g1.start();
        getAcc g2 = new getAcc(ac, "th2");
        g2.start();

    }
}
