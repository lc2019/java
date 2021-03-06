package day17.线程通信.原子性;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子类的安全问题
 * cap与加锁的区别
 * 悲观锁
 * 总是设想最坏的情况 每次拿数据都认为别人回修改 所以在拿数据的时候都会上锁
 * 共享资源只给1个资源使用其他线程阻塞等资源释放后转给其他线程
 * 乐观锁
 * 假设最好的情况 每次去拿数据的时候以为别人不会修改 不会上锁 只有在更新的时候会判断在此期间
 * 别人有没有更新数据
 */
public class atomic2 {
    public static void main(String[] args) {
        Runnable target = new myrunnable1();
        for (int i = 1; i <= 100; i++) {
            new Thread(target).start();
        }
    }
}

class myrunnable1 implements Runnable {
    //创建1个原子类
    private AtomicInteger atomic = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //先增加在获取
            System.out.println("count=========>" + atomic.incrementAndGet());
        }
    }
}
