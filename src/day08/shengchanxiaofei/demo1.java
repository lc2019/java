package day08.shengchanxiaofei;

/**
 * box 生产和消费的操作
 * 生产者 实现接口 重写run 生产牛奶
 * 消费者 实现接口 消费牛奶
 * 1.创建对象box
 * 2.创建生产者对象
 * 3.创建消费者对象
 * 4.2个线程，生产者和消费者作为参数传递
 */
public class demo1 {
    public static void main(String[] args) {
        Box b = new Box();
        shengchanzhe sc = new shengchanzhe(b); //接口
        xiaofeizhe xf = new xiaofeizhe(b);

        //创建线程对象，生产者和消费者作为参数传递
        Thread th1 = new Thread(sc);
        Thread th2 = new Thread(xf);

        //启动线程
        th1.start();
        th2.start();
    }
}
