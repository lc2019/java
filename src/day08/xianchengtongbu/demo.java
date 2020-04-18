package day08.xianchengtongbu;

/**
 * 线程同步问题
 */
public class demo {
    public static void main(String[] args) {
        selltick tk = new selltick();
        Thread th1 = new Thread(tk, "1");
        Thread th2 = new Thread(tk, "2");
        Thread th3 = new Thread(tk, "3");

        //启动
        th1.start();
        th2.start();
        th3.start();
    }
}
