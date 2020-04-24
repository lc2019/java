package day14.内部类;

/**
 * 匿名内部类
 * 回调
 */
public class Anonymity02 {
    public static void main(String[] args) {
        Swim s = new Swim() {

            @Override
            public void swimming() {
                System.out.println("学生yoyong");
            }
        };
        s.swimming();

        /**
         * 直接传递对象
         */
        go(new Swim() {
            @Override
            public void swimming() {
                System.out.println("34-2020.4.24");
            }
        });
    }

    public static void go(Swim s) {
        System.out.println("开始");
        s.swimming();
        System.out.println("over");
    }
}

interface Swim {
    void swimming();
}
