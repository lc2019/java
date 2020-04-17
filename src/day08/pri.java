package day08;

public class pri {
    public static void main(String[] args) {
        thread th1 = new thread();
        thread th2 = new thread();
        thread th3 = new thread();

        th1.getPriority();//默认是5

        //设置优先级
        th1.setName("huoche");
        th2.setName("feiji");
        th3.setName("qiche");

//        th2.setPriority(10);
//        th1.setPriority(7);

        th1.start();

        th2.start();
        try {
            //执行完th2在执行th3
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th3.start();

        //守护进程，主线程结束 其他也跟着结束
        th1.setDaemon(true);
        th2.setDaemon(true);

        Thread.currentThread().setName("huojian");

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "," + i);
        }


    }
}
