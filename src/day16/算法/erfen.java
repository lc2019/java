package day16.算法;

public class erfen {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 20, 18, 30, 80, 9, 23};
        int i = binarySerach(arr1, 9);
        System.out.println(i);
    }

    public static int binarySerach(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //中间元素的索引
            int mid = (start + end) / 2;
            //当前元素与中间元素比较，当前元素大于中间元素，往左查找，中间索引-1
            if (num > arr[mid]) {
                end = mid - 1;
            } else if (num < arr[mid]) {
                //当前元素小于中间元素，往右查找，中间索引+1
                start = mid + 1;
            } else if (num == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
