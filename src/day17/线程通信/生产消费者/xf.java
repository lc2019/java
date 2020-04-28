package day17.线程通信.生产消费者;

/**
 * 消费
 */
public class xf extends Thread {
    private account acc;

    //初始化 账户，取钱人
    public xf(account acc, String name) {
        super(name);
        this.acc = acc;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                //取钱
                acc.csmp(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
