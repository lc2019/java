package day08.scxfz;


public class demo {
    public static void main(String[] args) {
        //创建牛奶厂对象
        Nnc nl = new Nnc();
        //生产者对象
        sc s = new sc(nl);
        //消费者对象
        xf x = new xf(nl);


        //线程对象，使用生产者作为参数
        Thread th1 = new Thread(s);
        //实现接口重写了run方法
        Thread th2 = new Thread(x);

        //启动线程
        th1.start();
        th2.start();
    }
}
