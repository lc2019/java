package day17.thread;

public class thread1 {
    public static void main(String[] args) {
        /**
         * 线程创建：
         *   1，继承thread
         *      1。定义1个继承类
         *      2.重写run方法
         *      3.创建新的从线程对象
         *      4.start
         *   2.runnable
         *   3.callable接口
         */
        //创建1个线程对象
        testThread th1 = new testThread("1#");
        //调用线程对象start实际是执行run()方法，如果是run方法则是主线程里面执行
        th1.setName("th1-");
        th1.start();
        System.out.println(th1.getName());

        //创建1个线程对象
        testThread th2 = new testThread("2#");
        //调用线程对象start实际是执行run()方法，如果是run方法则是主线程里面执行
        th2.setName("th2-");
        th2.start();
        System.out.println(th2.getName());

//        for (int i = 0; i < 5; i++) {
//            System.out.println("main"+i);
//        }

        //main线程,获取线程的名称
        System.out.println(Thread.currentThread());

        Thread th3 = new testThread("3#");
        th3.start();
    }
}

class testThread extends Thread {
    public testThread(String s) {
        //调用父类的有参构造器，传递s参数
        super(s);
    }

    //重写run方法
    @Override
    public void run() {
        System.out.println("线程跑起来");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}
