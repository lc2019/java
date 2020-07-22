package day03.Arrays工具类;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 2, 1, 0, 28};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int index = Arrays.binarySearch(arr, 2);
        System.out.println(index);
    }
}
