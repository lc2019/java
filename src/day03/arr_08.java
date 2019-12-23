package day03;

import java.util.Arrays;

public class arr_08 {
    public static void main(String[] args) {
        char[] cs = {'A','B','C','D','E','F','G'};
        int len = cs.length;

        for (int i = 1; i <=len ; i++) {
            //输出空格
            for (int j = i; j < len ; j++) {
                System.out.print(" ");
            }
            //输出字母,注意越界问题，第一行是字母
            for (int j = 0; j <i*2 - 1 ; j++) {
                System.out.print(cs[i-1]);
            }
            System.out.println();
        }
    }
}
