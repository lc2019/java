package day09.nmlambda;

/**
 * 匿名内部类和lamabda的区别:
 * lambda必须是一个接口
 * 必须有上下文环境
 */
public class test {
    public static void main(String[] args) {
        //匿名内部类
        useinter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        //抽象类
        useanimal(new animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });

        //lambda
        useinter(() -> System.out.println("接口"));


    }

    public static void usestudy(study s) {
        s.xuexi();
    }

    public static void useinter(Inter i) {
        i.show();
    }

    public static void useanimal(animal a) {
        a.method();
    }
}
