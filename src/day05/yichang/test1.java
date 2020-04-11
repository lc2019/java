package day05.yichang;

public class test1 {
    public static void main(String[] args) {
        System.out.println("kais");
        method();
        System.out.println("jies");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常后继续执行");
            System.out.println("out of rangge");
            e.printStackTrace();
        }
    }
}
