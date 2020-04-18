package day08.shengchanxiaofei;

public class Box {
    private int milk;
    private boolean state = false;

    /**
     * 加锁 等待 唤醒
     *
     * @param milk
     */
    public synchronized void put(int milk) {
        //开始生产
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有 就生产
        this.milk = milk;
        System.out.println("song" + this.milk);

        //生产完毕更改状态
        state = true;
        //唤醒等待的线程
        notifyAll();
    }

    public synchronized void get() {
        //如果没有
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有就消费
        System.out.println("qu" + this.milk);
        //更改状态
        state = false;
        notifyAll();
    }
}
