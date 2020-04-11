package day05.neibulei;

public class niming {

    public void method() {
        /**
         * 接口 show方法
         *实现类对象
         */

        new T1() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show(); //对象调用show方法 {类名.方法}调用

        T1 t1 = new T1() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }; //对象调用show方法 {类名.方法}调用
        t1.show();
    }
}
