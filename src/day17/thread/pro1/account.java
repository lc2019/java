package day17.thread.pro1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 账户
 */
public class account {
    private String cardid;
    private double money;

    //创建一把锁对象
    private final Lock lock = new ReentrantLock();

    public account() {
    }

    /**
     * 初始化
     *
     * @param cardid 账户
     * @param money  余额
     */
    public account(String cardid, double money) {
        this.cardid = cardid;
        this.money = money;
    }

    /**
     * 获取
     *
     * @return cardid
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * 设置
     *
     * @param cardid
     */
    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    /**
     * 获取
     *
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     *
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    //账户取钱的方法  同步方法synchronized
//    public  synchronized void draw(double money)
    public void draw(double money) {
        //开始取钱
        String name = Thread.currentThread().getName();
        /**
         *         this表示当前共享账户
         */
        lock.lock();
        try {
//            synchronized (this){}

            if (this.money >= money) {
                System.out.println("取钱，余额足够");
                this.money -= money;
                System.out.println("剩余：" + this.money);
            } else {
                System.out.println("余额不足。。。");
            }
            lock.unlock();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
