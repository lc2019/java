package day17.thread.pro1;

public class getAcc extends Thread {
    private account acc;

    //取钱账户，账户名称
    public getAcc(account ac, String name) {
        super(name);
        this.acc = ac;
    }


    @Override
    public void run() {
        System.out.println("取钱");
        acc.draw(10000);
    }
}
