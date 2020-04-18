package day08.xianchengtongbu;

public class selltick implements Runnable {
    private int tickets = 50;
    //3个线程同一个锁，防止出现卖同一张票的情况
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //锁
            synchronized (obj) {
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
            }
        }
    }
}
