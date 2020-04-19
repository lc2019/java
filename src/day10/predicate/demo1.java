package day10.predicate;

import java.util.function.Predicate;

/*
        default Predicate<T> and(Predicate<? super T> other)
        返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑AND。

        static <T> Predicate<T> isEqual(Object targetRef)
        返回根据 Objects.equals(Object, Object)测试两个参数是否相等的 谓词 。

        default Predicate<T> negate() --返回表示此谓词的逻辑否定的谓词。

        default Predicate<T> or(Predicate<? super T> other)
        返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑或。

        boolean test(T t)
        在给定的参数上评估这个谓词。

 */
public class demo1 {
    public static void main(String[] args) {
        boolean bl = pktr("hello", s -> s.length() > 8);
        System.out.println(bl);
    }

    /**
     * 判断字符串的方法
     *
     * @param s   字符串
     * @param pre
     * @return 返回
     */
    private static boolean pktr(String s, Predicate<String> pre) {
//        return  !pre.test(s);
//        返回表示此否定的逻辑
        return pre.negate().test(s);
    }

}
