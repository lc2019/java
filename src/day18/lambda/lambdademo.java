package day18.lambda;

/**
 * 简化你们内部类的写法
 * （）->{}
 * 接口
 * 只有1个抽象方法的匿名内部类
 */
public class lambdademo {
    public static void main(String[] args) {
        //@FunctionalInterface 函数式接口 只有1个接口
//        new Thread(new Runnable() { //只有1个抽象方法
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//            }
//        }).start();

        //lambda表达式写法，通过上下文判断
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
