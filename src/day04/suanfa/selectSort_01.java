package day04.suanfa;

import java.util.Arrays;

public class selectSort_01 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 4, 3, 19, 2};
        anySort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static boolean anySort(int[] arr) {
        if (null == arr || arr.length == 0) {
            System.out.println("wuxiao");
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            //从0开始
            int index = i;
            //与后一位进行比较
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            //值交换
            if (index != i) {
                int tmp = arr[index];
                arr[index] = arr[i];
                arr[i] = tmp;
            }
        }
        return true;
    }
}
