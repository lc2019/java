package day03;

import java.util.Arrays;

public class arr_06 {
    public static void main(String args[]) {
        int[] scores = {59, 99, 0, 93, 100, 0, 2};
        int len = scores.length;
        for (int i = 0; i < len; i++) {
            int score = scores[i];
            System.out.println(score);
        }

        //forearch 打印
        //数组元素类型  变量：数组名
        for (int x : scores) {
            System.out.println(x);
        }

        print(scores);
        System.out.println(maxIndex(scores));

        System.out.println(indexOf(scores, 93));

        rep(scores, 1);
        System.out.println(Arrays.toString(scores));

        int[] nums = {59, 99, 0, 93, 100, 0, 2};
        int[] index =new int[nums.length];
        int count = findAllIndex(nums,index,0);
        System.out.println(count);
        System.out.println(Arrays.toString(index));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    //可变参数作为数组使用
    public static void print(int... x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

    }

    //数组下标
    public static int maxIndex(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            //如果下标为index的小于下标为i的，直接将i给index
            if (arr[index] < arr[i]) {
                index = i;
            }
        }
        return index;
    }

    //数组下标查找问题

    /**
     * 找出指定数据下标的位置，找不到返回-1
     *
     * @param arr  数组
     * @param find 给定的元素
     * @return 返回下标
     */
    public static int indexOf(int[] arr, int find) {
        //假设找不到
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            //下标i就是找到后的
            if (arr[i] == find) {
                index = i;
                break;
            }
        }
        return index;
    }

    //数组替换

    /**
     * 数组元素替换问题,将数组中的0全部替换掉给定的数值
     *
     * @param arr
     * @param num
     * @return
     */
    public static boolean rep(int[] arr, int num) {
        if (null == arr || arr.length == 0) {
            System.out.println("参数不合法");
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            //如果元素为0，直接替换成指定数值
            if (0 == arr[i]) {
                arr[i] = num;
            }
        }
        return true;
    }

    /**
     * 难点：如果有相同的值如何返回下标
     *
     * @param arr  给定数组
     * @param find 保存找到下标的数组
     * @return 元素个数
     */
    public static int findAllIndex(int[] arr, int[] index, int find) {
        if (null == arr || null == index||arr.length == 0
                || index.length == 0
                || index.length <arr.length ){
            System.out.println("参数不合法");
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //如果元素为0，直接替换成指定数值
            if (arr[i] == find) {
                //1.计数
//                count ++;
                //保留下标
                index[count++] = i;
            }
        }
        return count;
    }

    //找出数组最大的元素和下标为0的交换
    public static boolean change(int[]arr){
        if (null ==arr ||arr.length ==0){
            System.out.println("wuxiao");
            return false;
        }
        int index =0; //可以重1开始查找 跳过1
        //比较找出最大值的下标
        for (int i = 0; i <arr.length ; i++) {
            if (arr[index] <arr[i]){
                index = i;
            }
        }
        //最大值的下标与0进行交换
        if (index !=0){
            int tmp = arr[index];
            arr[index] = arr[0];
            arr[0] = tmp;
        }
        return true;
    }
}
