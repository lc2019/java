package day05.neibulei;

public class Outer2 {
    private int num = 100;

    /**
     * 外界无法直接访问
     */
    private int num2 = 100;

    /**
     * 通过方法来访问,局部内部类
     */
    public void method() {
        /**
         * 局部内部内 在方法中定义类
         */
        class Inner {
            public void show() {
                System.out.println("内部类show" + num);
            }
        }

        //需要在方法中创建使用
        Inner inner = new Inner();
        inner.show();
    }

}
