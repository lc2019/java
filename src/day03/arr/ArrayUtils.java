package day03.arr;

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
            //最小值大则值交换，min一直在换比他小的，直到最小值
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //反转
    public int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return arr;
    }

    //复制数组
    public int[] copy(int[] arr) {
        //定义1个新的数组来接收原来的数组，长度为原数组的长度
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
            //如果给定的元素与数组的元素符合
            if (dest == arr[i]) {
                //直接返回结束程序
                return i;
            }
        }
        //如果数组中没有与给定的值相同，则返回-1表示没找到
        return -1;
    }
}
