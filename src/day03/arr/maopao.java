package day03.arr;

/**
 * 冒泡排序
 */
public class maopao {
    public static void main(String[] args) {
        int[] arr = {10, 8, 29, 3, 28};
        mp(arr);
    }

    public static void mp(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //两两比较，如果前面大则交换
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
