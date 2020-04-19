package day10.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 配合Arraylist的使用，组合判断
 */
public class demo3 {
    public static void main(String[] args) {
        String[] arr = {"lc,20", "lulu,18", "雷超超,35"};
        /**
         * 2个判断条件 and
         * 名字长度大于2 并且年龄大于30
         *   判断方法
         *         s -> s.split(",")[0].length() > 2
         */

        ArrayList<String> mystr = mylist(arr, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 33);

        for (String s :
                mystr) {
            System.out.println(s);
        }
    }

    /**
     * 定义一个Arraylist的判断
     */
    private static ArrayList<String> mylist(String[] strarr, Predicate<String> pre1, Predicate<String> pre2) {
        //创建1个集合来存储给定集合的元素
        ArrayList<String> arr = new ArrayList<>();
        for (String s : strarr) {
            //进行判断
            if (pre1.and(pre2).test(s)) {
                arr.add(s);
            }
        }
        return arr;
    }
}
