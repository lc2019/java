package day03.arr;

public class halfSer {
    public static void main(String[] args) {

    }

    /**
     * 二分查找，前提数组是有序的
     *
     * @param arr
     * @param key
     * @return
     */
    public static int halfSer(int[] arr, int key) {
        int max, mid, min;
        min = 0;
        max = arr.length - 1;
        mid = (max + min) / 2;

        while (arr[mid] != key) {
            if (key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            if (max < min)
                return -1;
        }
        return mid;
    }

    public static int halfSer2(int[] arr, int key) {
        int max, min, mid;
        min = 0;
        max = arr.length - 1;
        while (min <= max) {
            mid = (max + min) >> 1;
            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            }
            return mid;

        }
        //如果要插入一个元素直接返回min min是一直变大的
        return -1;
    }
}
