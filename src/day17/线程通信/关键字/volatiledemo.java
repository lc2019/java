package day17.线程通信.关键字;

/**
 * 多线程访问共享资源，会出现1个线程修改变量的值后 其他线程看不见修改后的变量
 * 线程变量不可见原因：
 * 每个线程都有自己的工作内存，线程从主内存拷贝共享变量的副本，每个线程自己的工作内存中操作共享变量
 * <p>
 * 解决方案：
 * 加锁-得到锁清空自己的工作变量，重新从主内存拷贝共享变量的副本（刷新也可以）
 * volatile修饰的变量修改后  通知所有线程工作内存共享变量失效 重新从主内存读取  -实例变量和类变量
 * 保证变量的可见性
 */
public class volatiledemo extends Thread {
    private boolean flag = false;
//    volatile修饰的变量修改后  通知所有线程工作内存共享变量失效 重新从主内存读取
//    private volatile boolean flag = false; //加关键字修饰

    public volatiledemo() {

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        //线程启动后flag的值已经修改为true
        System.out.println("flag=" + flag);
    }
}

class visiblity {
    public static void main(String[] args) {
        volatiledemo th1 = new volatiledemo();
        th1.start();

        //主线程无法执行，看不到flag改变的结果
        while (true) {
            //加锁-得到锁清空自己的工作变量，重新从主内存拷贝共享变量的副本（刷新也可以），修饰方法和代码块
            synchronized (volatiledemo.class) {
                if (th1.isFlag()) {
                    System.out.println("主线程执行");
                }
            }
        }
    }
}