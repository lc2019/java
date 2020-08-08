package day03.arr;

/**
 * 找出指定元素的下标，找到返回index，找不到返回-1
 */
public class arrFind {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int index = indexof(arr, 6);
        System.out.println(index);

    }

    public static int indexof(int[] arr, int find) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                index = i;
            }
        }
        return index;
    }
}
