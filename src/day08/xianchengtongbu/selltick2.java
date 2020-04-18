package day08.xianchengtongbu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class selltick2 implements Runnable {
    private int tickets = 50;
    //3个线程同一个锁，防止出现卖同一张票的情况
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            try {
                lock.lock();//加锁
                if (tickets > 0) {
                    //出票时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售" + tickets + "张票");
                    tickets--;
                }
            } finally {
                //释放锁
                lock.unlock();
            }
        }
    }
}
