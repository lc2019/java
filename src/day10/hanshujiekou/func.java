package day10.hanshujiekou;

import java.util.function.Function;

/**
 * 函数式接口
 *
 * @FunctionalInterface public interface Function<T,R>表示接受一个参数并产生结果的函数。配合lambda来使用
 * 这是一个functional interface的功能方法是apply(Object) 。
 * <p>
 * default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
 * 返回一个组合函数，首先将该函数应用于其输入，然后将 after函数应用于结果。
 * <p>
 * R apply(T t)
 * 将此函数应用于给定的参数。
 * <p>
 * default <V> Function<V,R> compose(Function<? super V,? extends T> before)
 * 返回一个组合函数，首先将 before函数应用于其输入，然后将此函数应用于结果。
 * <p>
 * static <T> Function<T,T> identity()
 * 返回一个总是返回其输入参数的函数。
 */
public class func {
    public static void main(String[] args) {
        //lambda表达式，字符串转int
        pksi("100", s -> Integer.parseInt(s));
        //引用方法，参数全部传递给静态方法
//        pksi("100", Integer::new);

        //字符串取值
        pksi(200, i -> String.valueOf(i));
        //引用方法，参数全部传递给静态方法
//        pksi(100, String::valueOf);

        //组合判断
        pksi("300", s -> Integer.parseInt(s), i -> String.valueOf(i + 100));
    }


    public static void pksi(String s, Function<String, Integer> func) {
        int i = func.apply(s);
        System.out.println(i);
    }

    public static void pksi(int i, Function<Integer, String> func) {
        String s = func.apply(i);
        System.out.println(s);
    }

    public static void pksi(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        //组合条件判断，applay应用结果
        String s1 = fun1.andThen(fun2).apply(s);
        System.out.println(s1);
    }
}
