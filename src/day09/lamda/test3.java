package day09.lamda;

public class test3 {
    public static void main(String[] args) {
        /**
         * 配合接口使用
         * 接口只能有1个接口
         * 必须有上下文环境
         */
        useshow(() -> System.out.println("java"));

        Runnable r = () -> System.out.println("lambda表达式");
        new Thread(r).start();

        new Thread(() -> System.out.println("lambda线程启动")).start();
    }

    public static void useshow(ish i) {
        i.show();
    }
}
