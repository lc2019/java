package day05.random;

import java.util.Random;

public class demo2 {
    public static void main(String[] args) {
        /**
         * 5个不重复的随机数
         */
        int[] arr = new int[5];
        //数组的初始值-1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        Random rd = new Random();
        int index = 0;
        while (index < arr.length) {
            int num = rd.nextInt(5);
            //如果数组不包含则复制 index++
            if (!contains(arr, num)) {
                arr[index++] = num;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean contains(int[] arr, int key) {
        //如果数组包含元素返回true
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        //否则返回false
        return false;
    }
}
