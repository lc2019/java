package day03.arr;

import java.util.Arrays;

/**
 * 数组插入
 */
public class arrInsert {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 4, 5, 6, 0};
        insert(arr, 4, 10);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 整体向后平移一位
     *
     * @param arr   数组
     * @param index 索引
     * @param value 要插入的值
     * @return 返回值
     * <p>
     * arr[7]=arr[6]
     * arr[6]=arr[5]
     * arr[5]=arr[4]
     */
    public static boolean insert(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        return true;
    }
}
