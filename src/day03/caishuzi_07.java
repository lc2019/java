package day03;

import java.util.Random;
import java.util.Scanner;

public class caishuzi_07 {
    public static void main(String args[]){
//        int[] nums = {30,17,6,2,22,27};

        int[] nums =  new int[5];
        int len =  nums.length;
        //伪随机数
        Random r = new Random();
        //猜5次
        for (int i = 0; i <len ; i++) {
            nums[i] = r.nextInt(50);
        }

        Scanner input  = new Scanner(System.in);
        System.out.println("enter a num，50以内:");
        int userNum = input.nextInt();

        //标志
        boolean flag =  false;
        for (int x:nums) {
            if (userNum == x){
                flag = true;
                break;//结束for循环
            }
        }
        if (flag){
            System.out.println("right");
        }else {
            System.out.println("error");
        }
    }
}
