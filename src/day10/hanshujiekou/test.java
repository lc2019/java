package day10.hanshujiekou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 函数式接口+lambda
 */
public class test {
    public static void main(String[] args) {
        //构造使用的场景
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ccc");
        arr.add("aa");
        arr.add("a");
        arr.add("ddd");
        System.out.println(arr);

        //数组 和 对象
        Collections.sort(arr, getcompare());
        System.out.println(arr);
    }

    //函数式接口
    private static Comparator<String> getcompare() {
//        return new Comparator<String>(){
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };
        //lambda的作为结果返回
        return (s1, s2) -> s1.length() - s2.length();
    }
}
