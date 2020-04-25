package day15.泛型;

import java.util.ArrayList;

/**
 * 约束标签
 * 出现泛型的地方全部换为真实的数据类型
 * 泛型定义 T E k v
 * ？代表一切泛型
 * <p>
 * 泛型的上下限
 * ? extens car ?必须是car或子类
 */
public class Generics1 {

    public static void main(String[] args) {
        ArrayList<Integer> itg = new ArrayList<>();
        itg.add(1);
        itg.add(2);
        itg.add(3);
        System.out.println(itg);

        Integer[] it1 = {1, 2, 3, 4};
        String s1 = arrtoString(it1);
        System.out.println(s1);

        ArrayList<bmw> b1 = new ArrayList<>();
        b1.add(new bmw());
        b1.add(new bmw());
        b1.add(new bmw());

        ArrayList<bz> bzs = new ArrayList<>();
        bzs.add(new bz());
        bzs.add(new bz());
        bzs.add(new bz());
    }

    /**
     * 通用的方法
     *
     * @param nums 参数
     * @param <T>  泛型
     * @return String
     */
    public static <T> String arrtoString(T[] nums) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        if (nums != null && nums.length > 0) {
            for (T ele : nums) {
                /**
                 * 最后1个不加，
                 */
                sb1.append(ele == nums[nums.length - 1] ? ele : ele + ",");
            }
        }
        sb1.append("]");
        return sb1.toString();
    }

    //定义1个方法可以让汽车一起加入参赛
    public static void run(ArrayList<?> cars) {

    }
}


class Car {

}

class bmw extends Car {

}

class bz extends Car {

}