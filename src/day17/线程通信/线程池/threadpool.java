package day17.线程通信.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 容纳多个线程的容器，线程可以反复使用
 * 省去频繁创建和销毁线程对象的操作
 * 工作线程+task
 */
public class threadpool {
    public static void main(String[] args) {
        //创建线程池，每次执行的任务3
        ExecutorService pools = Executors.newFixedThreadPool(3);

        //添加任务到线程池处理
        Runnable tar = new myrunnable();

        //提交任务到工作线程，`public Future<?> submit(Runnable task)`:获取线程池中的某一个线程对象，并执行
        pools.submit(tar); //提交后自动出发执行
        pools.submit(tar);
        pools.submit(tar);
        pools.submit(tar);

        //线程池的关闭
        pools.shutdown();
    }
}

class myrunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }

    }
}
