package day03.arr;

/**
 * 找数组中最后出现数字的下标
 */
public class lastIndexof {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 1, 2, 5, 1, 3, 4};
        int index = lastindexof(arr, 3);
        System.out.println(index);

    }

    public static int lastindexof(int[] arr, int find) {
        /**
         * 使用逆序思维，倒序查找
         */
        int index = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (find == arr[i]) {
                index = i;
                //找到以后，退出循环不在查找
                break;
            }
        }
        return index;
    }
}
