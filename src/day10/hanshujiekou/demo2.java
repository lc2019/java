package day10.hanshujiekou;

public class demo2 {

    public static void main(String[] args) {
        /**
         * 函数十接口作为参数传递
         */
//    starthread(new Thread(){
//        @Override
//        public void run() {
//            System.out.println(Thread.currentThread().getName()+"启动");
//        }
//    });
        //参数是函数式接口，可以作为lambda的参数传递
        starthread(() -> System.out.println(Thread.currentThread().getName() + "启动"));
    }

    //参数是函数式接口
    public static void starthread(Runnable r) {
        new Thread(r).start();
    }
}
