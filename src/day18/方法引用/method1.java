package day18.方法引用;

import java.util.ArrayList;
import java.util.List;

public class method1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java1");
        list.add("java2");

        list.forEach(s -> System.out.println(s));

        //方法引用
        /**
         * 静态方法引用
         * 引用和被引用的参数列表一致
         * （被引用的参数列表和函数方法中的抽象方法参数一致）
         */
        list.forEach(System.out::println);
    }
}
