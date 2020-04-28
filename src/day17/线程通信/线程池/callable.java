package day17.线程通信.线程池;

import java.util.concurrent.*;

/**
 * callable可以得到线程执行的结构
 */
public class callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池
        ExecutorService pools = Executors.newFixedThreadPool(3);

        //提交callable的任务对象，返回未来任务对象
        Future<String> res1 = pools.submit(new mycall(100));
        Future<String> res2 = pools.submit(new mycall(200));
        Future<String> res3 = pools.submit(new mycall(300));
        Future<String> res4 = pools.submit(new mycall(400));

        //获取未来任务对象执行的结果
        String s1 = res1.get();
        String s2 = res2.get();
        String s3 = res3.get();
        String s4 = res4.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //线程池关闭
        pools.shutdown();
    }
}

class mycall implements Callable<String> {
    private int n;

    public mycall(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "结果：" + sum;
    }
}
