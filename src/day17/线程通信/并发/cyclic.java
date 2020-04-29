package day17.线程通信.并发;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class cyclic {
    //创建一个循环屏障,等待5个线程执行完成后触发任务
    public static void main(String[] args) {
        CyclicBarrier cyb = new CyclicBarrier(5, new meeting());
        for (int i = 0; i < 5; i++) {
            new testThread("员工" + i, cyb).start();
        }

    }
}

class testThread extends Thread {
    private CyclicBarrier c;

    public testThread(String s, CyclicBarrier c) {
        super(s);
        this.c = c;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "正在进入会议室。。。");
            //每个线程到达后告诉CyclicBarrier，然后当前线程被回收
            c.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class meeting implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始会议。。。");

    }
}