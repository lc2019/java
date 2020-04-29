package day17.thread;

public class runnable1 {
    public static void main(String[] args) {
        //多态实现类，线程任务对象不是线程对象
        Runnable run1 = new testrunnale();
        //包装成线程对象
        Thread th1 = new Thread(run1);
        Thread th2 = new Thread(run1, "1#");
        //启动线程
        th1.start();
        th2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

class testrunnale implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
