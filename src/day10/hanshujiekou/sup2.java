package day10.hanshujiekou;

import java.util.function.Supplier;

public class sup2 {
    //    @FunctionalInterface
//    public interface Supplier<T>
//    没有要求每次调用都会返回新的或不同的结果。
    public static void main(String[] args) {
        int[] arr = {10, 59, 28, 37, 46};
        //通过lambda来实现接口
        int maxv = getmax(() -> {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxv);
    }

    //方法
    public static int getmax(Supplier<Integer> s) {
        return s.get();
    }
}
