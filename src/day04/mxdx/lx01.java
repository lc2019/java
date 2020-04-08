package day04.mxdx;

public class lx01 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 3, 3, 34, 56, 77, 432};
//        int tmp = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            //arr0 已经变了
////            arr[i] =arr[i]/arr[0];
//            arr[i] =arr[i]/tmp;

        //倒序
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        int[] arr2 = new int[]{1, 2, 3};
        System.out.println(arr2); //[I@610455d6

        char[] c = new char[]{'a', 'b'};
        System.out.println(c); //a,b

        String[] s = new String[]{"遍历", "切片"};
        System.out.println(s); //地址
    }
}
