package day03.arr;

/**
 * 数组最大值的下标
 */
public class arrMaxIndex {
    public static void main(String[] args) {
        //假定下标的最大值是max
        int max = 0;
        int[] arr = {10, 9, 20, 40, 5};
        for (int i = 0; i < arr.length; i++) {
            /**
             * 如果arr[max]小于arr[i]，则i=max
             */
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        System.out.println(arr[max]);
    }
}
