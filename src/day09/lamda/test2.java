package day09.lamda;

public class test2 {
    public static void main(String[] args) {
        //参数的类型可以省略
//        getsum((int x, int y) -> {
//        getsum(( x,  y) -> {
////            return x + y;
//            return x - y;
//        });

        //省略return 只有1跳语句的时候
        getsum((x, y) -> x + y);
    }

    //方法传入接口作为参数
    public static void getsum(sum s) {
        int sum = s.add(10, 20);
        System.out.println(sum);
    }
}
