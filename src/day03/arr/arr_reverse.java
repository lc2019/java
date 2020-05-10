package day03.arr;

import java.util.Arrays;

/**
 * 数组逆序
 */
public class arr_reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 数组逆序
     * arr[0]=arr[8]----->08 17 26 35
     *
     * @param arr
     */
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            //值交换
            arr[arr.length - 1 - i] = tmp;
        }

    }
}
