package day17.线程通信.并发;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class bf1 {
    //线程不安全
//    public  static Map<String,String> maps = new HashMap<String,String>();
    //线程安全
//    public  static Map<String,String> maps = new Hashtable<>();
    //兼顾性能和安全
    public static Map<String, String> maps = new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException {
        Runnable myrun = new myrun();
        Thread th1 = new Thread(myrun, "-1");
        Thread th2 = new Thread(myrun, "-2");

        //启动线程
        th1.start();
        th2.start();

        //等待线程跑完
        th1.join();
        th2.join();

        System.out.println("元素："+maps.size());
    }
}

class  myrun implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 500000; i++) {
            bf1.maps.put(Thread.currentThread().getName()+i,Thread.currentThread().getName()+i);
        }
    }
}
