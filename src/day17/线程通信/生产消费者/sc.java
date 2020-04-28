package day17.线程通信.生产消费者;

/**
 * 生产
 */
public class sc extends Thread {
    private account acc;

    public sc(account acc, String name) {
        super(name);
        this.acc = acc;
    }

    //存钱
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                //存钱
                acc.save(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

