package day03.ArrayUtils;

public class arr_maopao {
    public static void main(String[] args) {
        int[] arr = {11, 9, 20, 28, 5, 21};
        mp(arr);
    }

    public static void mp(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }
    }
}
