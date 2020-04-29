package day16.算法;

import java.util.Arrays;

/**
 * 选择排序
 * 当前位置与后面比较 小的换位置
 */
public class xuanzepaixu {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            //当前元素与后面进行比较
            int cdata = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < cdata) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
