package day05.neibulei;

public class Outer {
    private int num = 100;

    /**
     * 外界无法直接访问
     */
    private class Inner {
        public void show() {
            System.out.println("内部类show" + num);
        }
    }

    /**
     * 通过方法来访问
     */
    public void method() {
        Inner i = new Inner();
        i.show();
    }
}
