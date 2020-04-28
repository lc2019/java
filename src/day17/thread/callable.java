package day17.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //接口
        Callable mycall = new mycall();
        //任务对象包装成未来任务对象，得到线程执行的结果
        FutureTask<String> task = new FutureTask<>(mycall);

        //未来任务对象保证成线程对象
        Thread th1 = new Thread(task);
        th1.start();

        String s1 = task.get();
        System.out.println(s1);
    }
}

//创建一个线程任务类实现callable接口，申明线程返回的结果类型
class mycall implements Callable<String> {
    //重写线程任务类的call方法
    @Override
    public String call() throws Exception {
        String s = "haha,线程带有返回值";
        return s;
    }
}