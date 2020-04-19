package day09.lamda;

public class demo1 {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程启动");
//            }
//        }).start();

        //lamda表达式 ()-类似run
        new Thread(() ->
                System.out.println("多线程启动")).start();
    }
}
