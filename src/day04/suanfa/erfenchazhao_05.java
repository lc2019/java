package day04.suanfa;

public class erfenchazhao_05 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 13, 15, 17, 19};
        int res = erf(arr, 13);
        System.out.println(res);
    }

    public static int erf(int[] arr, int find) {
        if (null == arr || arr.length == 0) {
            System.out.println("wuxiao");
            return -1;
        }
        int index = 0;
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int midIndex = (minIndex + maxIndex) / 2;
        while (minIndex <= maxIndex) {
            if (arr[midIndex] < find) {
                // 1 3 5 7 9   如果找7  min 0 mid是2 max是4 min+1
                minIndex = midIndex + 1;
            } else if (arr[midIndex] > find) {
                // // 1 3 5 7 9   如果找3  min 0 mid是2 max是4 mid-1
                maxIndex = midIndex - 1;
            } else {
                //直接相等的情况
                index = midIndex;
                break;
            }
            midIndex = (maxIndex + minIndex) / 2;
        }
        return index;

    }
}
