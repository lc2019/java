package day03.ArrayUtils;

public class arraySer {
    public static void main(String[] args) {
        /**
         * 二分法查找 数组是有序的 找18
         * 11 12 13 14 15 16 17 18 19 20 （10个）
         * 中间元素 arr[5]=15
         *  开始下标变成5+1
         *  重新计算中间元素的下标
         *  如果找20 最后一次 （9+9)/2 arr9=20
         */
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int index = binSer(arr, 18);
        System.out.println(index);

    }

    private static int binSer(int[] arr, int dest) {
        int begin = 0;
        int end = arr.length - 1;
        //开始在一直增加，end在一直减小 当重合的时候就是找到元素
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {
                //元素在中间的右边，begin要向后移动
                begin = mid + 1;
            } else {
                //元素在中间的右边，end要向前移动
                end = mid - 1;
            }
        }
        return -1;
    }
}
