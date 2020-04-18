package day08.scxfz;

/**
 * 牛奶厂生产牛奶
 */
public class Nnc {
    private int milk;
    private boolean state = false;

    /**
     * 生产
     *
     * @param milk
     */
    public synchronized void put(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("生产" + this.milk);
        state = true;
        notifyAll();
    }

    /**
     * 消费
     */
    public synchronized void get() {
        //看是否有牛奶 ，线程锁
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费" + this.milk);
        //刷新状态
        state = false;
        //通知线程
        notifyAll();
    }
}
