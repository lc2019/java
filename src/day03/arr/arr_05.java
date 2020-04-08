package day03.arr;

import java.util.Arrays;

/**
 * 数组 一组能够存储相同数据类型的变量的集合
 * 数组声明和赋值
 */
public class arr_05 {
    public static void main(String args[]) {
        //1数组声明
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = i;
            System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));

        //2数组声明并初始化
        int[] num1 = new int[]{1, 2, 3, 4, 5};

        //3数组声明：数组类型[] 数组名 = 数组
        int[] nums2 = {1, 2, 3, 4, 5};

        showInt(num1);
    }

    //数组作为参数使用
    public  static void showInt(int[] x){
        for (int i = 0; i < 5; i++) {
           x[i] = i;
        }
        System.out.println(Arrays.toString(x));
    }
}
