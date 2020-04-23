package day13.抽象类;

public class daimakuai {
    /**
     * 静态static的变量初始化
     */
    static {
        System.out.println("静态代码块，最先执行");
    }

    {
        /**
         * 实例代码块
         *构造器中取执行
         */
        System.out.println("实例代码块执行1次");
    }

    public static void main(String[] args) {
        System.out.println("main coding....");

        daimakuai dmk = new daimakuai();
        daimakuai dmk2 = new daimakuai();

    }
}
