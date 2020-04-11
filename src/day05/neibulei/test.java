package day05.neibulei;

/**
 * test类
 */
public class test {
    public static void main(String[] args) {
        /**
         * 创建内部类 并调用方法
         */
        Outer outer = new Outer();
        outer.method();

        Outer2 o2 = new Outer2();
        o2.method();

        niming nm = new niming();
        nm.method();
    }
}
