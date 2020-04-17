package day08.thread;

/**
 * 线程实现方式
 * thread执行 创建继承thread，重写run方法
 */
public class jc {
    public static void main(String[] args) {
        mythread th1 = new mythread();
        mythread th2 = new mythread();

//        th1.run();
//        th2.run();
        //线程名称
        th1.setName("huoche");
        th2.setName("huiji");
        //线程启动
        th1.start();
        th2.start();

        //获取当前线程名称
        //1.获取当前线程
        //2.获取线程名称
        System.out.println(Thread.currentThread().getName()); //main
    }
}
