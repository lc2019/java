package day03.arr;

public class SelectSort {
    public static void main(String[] args) {
        /**
         * 选择排序
         *  循环找出参加比较的数据中最小的，然后使用最小值和最前面的数据交换位置
         */
        int[] arr = {3, 1, 6, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            //将设第一个最小
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                //找出最小值
                if (arr[j] < arr[min]) {
                    //最小值的下标min
                    min = j;
                }
            }
            //如果min不等于i，表示猜测错误需要发生交换
            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
