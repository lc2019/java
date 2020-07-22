package day03.Arrays工具类;

import java.util.Arrays;

public class binSerarch {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 15, 6, 9, 3, 4, 2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分查找-前提数据必须是有序的，未找到返回负数
        int i = Arrays.binarySearch(arr, 6);
        System.out.println(i);

        /**
         * 源码
         *     private static int binarySearch0(int[] a, int fromIndex, int toIndex,
         *                                      int key) {
         *         int low = fromIndex;
         *         int high = toIndex - 1;
         *
         *         while (low <= high) {
         *             int mid = (low + high) >>> 1;
         *             int midVal = a[mid];
         *
         *             if (midVal < key)
         *                 low = mid + 1;
         *             else if (midVal > key)
         *                 high = mid - 1;
         *             else
         *                 return mid; // key found
         *         }
         *         return -(low + 1);  // key not found.
         *     }
         */
    }
}
