package day17.线程通信.原子性;

/**
 * 原子性
 * 加锁
 * volatile只能保证变量的可见性 不能保证线程的原子性
 */
public class atomic {
    public static void main(String[] args) {
        Runnable tar = new myrunnable();
        for (int i = 1; i <= 100; i++) {
            //执行的结果可能不一致 ，可能同一时间变量只自增了1此
            new Thread(tar).start();
        }
    }
}

class myrunnable implements Runnable {
    private volatile int count;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                count++;
                System.out.println("count===>" + count);
            }
        }
    }
}