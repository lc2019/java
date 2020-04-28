package day17.线程通信.死锁;

/**
 * 死锁代码：锁嵌套 等待
 * 死锁产生的条件：
 * 1.互斥 资源只能被一个资源占用
 * 2.不可抢占 不能被抢占
 * 3.请求和保持 请求其他资源同时保持对原有资源的占有
 * 4.循环等待  p1=p2 p2=p1
 */
public class deadlock {
    public static Object res1 = new Object();
    public static Object res2 = new Object();

    public static void main(String[] args) {
        /**
         * 锁嵌套
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (res1) {
                    System.out.println("线程1占用资源1，锁资源2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res2) {
                        System.out.println("线程1占用资源1ok");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (res2) {
                    System.out.println("线程2占用资源2，锁资源1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res1) {
                        System.out.println("线程2占用资源1ok");
                    }
                }
            }
        }).start();
    }
}
