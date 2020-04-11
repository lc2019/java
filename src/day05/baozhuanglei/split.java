package day05.baozhuanglei;

import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String s = "92 28 19 20 39";
        String[] arr = s.split(" ");
        int[] i1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            i1[i] = Integer.parseInt(arr[i]);
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //对int数组排序
        Arrays.sort(i1);

        //把排序后的数组元素进行拼接
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s1.append(i1[i]);
            } else {
                //拼接+" "
                s1.append(i1[i]).append(" ");
            }
            //数组转为字符串
            String res = s1.toString();

            System.out.println(res);
        }
    }
}
