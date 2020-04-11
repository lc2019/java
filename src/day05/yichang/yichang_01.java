package day05.yichang;

//自定义异常

/**
 * public Throwable(String message) {
 * detailMessage = message;
 * }
 * public String getMessage() {
 * return detailMessage;
 * }
 */
class StaticException extends Exception {
    //空的构造
    public StaticException() {
    }

    //构造器调用父类
    public StaticException(String message) {
        super(message);
    }

}


public class yichang_01 {
    public static void main(String[] args) throws StaticException {
        //异常类
        Throwable throwable = new Throwable("有异常"); //传递的参数
        //返回异常详细的字符串
        System.out.println(throwable.getMessage()); //获取传递的参数
        //简短描述
        System.out.println(throwable.toString());
//        throwable.printStackTrace();


        test(1, 0);
        System.out.println("ok");

        test1(false);
        test1(true);
    }

    public static void test(int num1, int num2) {
        int ret = 0;
        try {
            ret = num1 / num2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(ret);
    }

    //定义方法
    public static void test1(boolean isSingle) throws StaticException {
        if (isSingle) {
            throw new StaticException("danshengou");
        }
        System.out.println("tuodan");
    }
}
