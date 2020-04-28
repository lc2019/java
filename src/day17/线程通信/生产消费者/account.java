package day17.线程通信.生产消费者;

public class account {
    private String cardid;
    private double money;


    public account() {
    }

    public account(String cardid, double money) {
        this.cardid = cardid;
        this.money = money;
    }


    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }


    public double getMoney() {
        return money;
    }


    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 前提是线程安全 同步synchronized
     * 取钱方法
     */

    public synchronized void csmp(double money) throws InterruptedException {
        String s = Thread.currentThread().getName();
        if (this.money >= money) {
            this.money -= money;
            System.out.println(s + "取钱。。。");
            System.out.println("剩余:" + this.money);

            //没钱了等待
            this.notifyAll();
            this.wait();
        } else {
            this.notifyAll();
            this.wait();
        }
    }

    /**
     * 前提是线程安全 同步synchronized
     * 存钱方法
     *
     * @param money
     */
    public synchronized void save(double money) throws InterruptedException {
        String s = Thread.currentThread().getName();
        if (this.money > 0) {
            //余额足够唤醒其他线程
            this.notifyAll();
            this.wait();

        } else {
            this.money += money;
            System.out.println(s + "存钱。。。");
            System.out.println("剩余:" + this.money);
            this.notifyAll();
            this.wait();
        }
    }
}
