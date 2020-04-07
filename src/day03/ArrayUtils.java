package day03;

public class ArrayUtils {
    public static void main(String[] args) {
        ArrayUtils arrs = new ArrayUtils();
        int[] arr = {3, 2, 7, 1, 2, 5, 0};
        int res = arrs.getMin(arr);
        int res1 = arrs.getMax(arr);
        System.out.println(res1);

    }

    //最大值
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //最小值
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //反转
    public int[] reversr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return arr;
    }

    //复制数组
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //数组排序
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - j; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //查找指定元素
    public int getIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
