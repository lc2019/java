package day18.方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class newConstructor {
    public static void main(String[] args) {
        /**
         * 构造器引用
         */
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");
        lists.add("java4");
        Object[] obj = lists.toArray();
        System.out.println(Arrays.toString(obj));
//        String[] strs = lists.toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
////
    }
}
