package day03.ArrayUtils;

import java.util.Arrays;

/**
 * 求数组中的最大值，最小值
 */
public class arr_meth_10 {
    public static void main(String[] args) {
        int[] num = {10, 3, 54, 67, 88, 1, 2};
        int res = max(num);
        System.out.println(res);

        int res1 = min(num);
        System.out.println(res1);

        selectSort(num);
        System.out.println(Arrays.toString(num));


        //arr的删除
        int[] arr = {1, 2, 5, 2, 3, 34, 2};
        remove(arr, 5);
        System.out.println(Arrays.toString(arr));

        add(num, 2, 20);
        System.out.println(Arrays.toString(num));
    }

    public static int max(int[] num) {
        int max = num[0];
        int len = num.length;
        for (int i = 0; i < len; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

    public static int min(int[] num) {
        int min = num[0];
        int len = num.length;
        for (int i = 0; i < len; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        return min;
    }


    //arr的删除
    //int[] arr =  {1, 2, 5, 2, 3, 34, 2};
    //假如删除3    {1，2，5，2，34，2，0}
    // arr[i]  = arr[i+1] arr[length-1]=0
    public static boolean remove(int[] arr, int index) {
        if (null == arr || arr.length == 0 || index < 0
                || index > arr.length - 1) {
            System.out.println("out of range");
            return false;
        }
        //从指定的位置开始，整体向前平移一位
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        //最后1个元素为0
        arr[arr.length - 1] = 0;
        return true;
    }

    /**
     * @param arr
     * @param index
     * @return
     */
    public static boolean add(int[] arr, int index, int insert) {
        if (null == arr || arr.length == 0 || index < 0
                || index > arr.length - 1) {
            System.out.println("out of range");
            return false;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            //整体向后平移1位
            //int[] arr =  {1, 2, 5, 2, 3, 34, 2};
            //int[] arr =  {1, 2, 6，5, 2, 3, 34};
            // arr4 = arr3 arr5=arr4 arr[i] = arr[i-1]
            arr[i] = arr[i - 1];
        }
        //插入元素的数值
        arr[index] = insert;
        return true;
    }

    //选择排序的实现
    public static boolean selectSort(int[] arr) {
        if (null == arr || arr.length == 0) {
            System.out.println("wuxiao");
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            //极值的开始，从0开始
            int index = i;
            //排序比较
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
