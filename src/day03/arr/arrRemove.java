package day03.arr;

public class arrRemove {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 4, 5, 6, 10};

    }

    /**
     * 删除指定下标元素的内容
     *
     * @param arr
     * @param index
     * @return 元素向前移动1位
     * 删除下标2的元素
     * arr[3]=arr[4]
     * arr[4]=arr[5]
     * arr[5]=arr[6]
     * arr[6]=arr[7]
     * arr[i]=arr[i+1]
     * arr[7]=0
     */
    public static boolean remove(int[] arr, int index) {
        //越界问题
        if (index < 0 || index > arr.length - 1) {
            return false;
        }
        //删除元素
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return true;
    }
}
