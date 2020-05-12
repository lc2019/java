package day03.arr;

/**
 * 找出数组所有的元素
 */
public class FindArrAll {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 3, 2};
        int[] arr2 = new int[arr.length];
        int i = allArrIndexof(arr, arr2, 3);
//        System.out.println(i);

        for (int j = 0; j < i; j++) {
            System.out.println(arr2[j]);
        }
    }

    /**
     * 尾插法
     * 计数器记录元素出现的次数
     * 下一个元素存放的位置
     *
     * @param arr
     * @param arr2
     * @param find
     * @return
     */
    public static int allArrIndexof(int[] arr, int[] arr2, int find) {
        //查询到的指定元素的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //找到给定的元素
            if (find == arr[i]) {
                //记录元素位置
                arr2[count] = i;
                //计数器
                count += 1;
            }
        }
        return count;
    }
}
