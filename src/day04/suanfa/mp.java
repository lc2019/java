package day04.suanfa;

/**
 * 冒泡
 */
public class mp {
    public static void main(String[] args) {
        int[] arr = {9, 234, 2, 1, 23, 56};
        //放置arr[j+1]下标越界
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
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
