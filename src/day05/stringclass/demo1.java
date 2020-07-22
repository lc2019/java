package day05.stringclass;

/**
 * String类
 */
public class demo1 {
    public static void main(String[] args) {
        /**
         * 所有的""的变量都在常量池
         * 通过new创建的保存的是常量池的地址
         */
        String aa = "haha";
        //a2保存的是常量池内存地址指向（0x1234）----->常量池 haha
        String a2 = new String("haha");

    }
}
