package day08.thread;

public class rundemo {
    public static void main(String[] args) {
        /**
         * 实现接口的方式
         */
        runable r1 = new runable();
        Thread th1 = new Thread(r1, "feiji");
        Thread th2 = new Thread(r1, "gaotie");

        th1.start();
        th2.start();
    }
}
