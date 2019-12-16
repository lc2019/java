package day05;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        //定义1个数组长度为5
        int[] nums = new int[5];
        //生成1个随机数的类的实例化
        Random r = new Random();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = r.nextInt(50);
        }
        //获取键盘输入
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num");

        //获取随机数
        int num =  input.nextInt();

        Boolean flag = false;
        for (int x : nums) {
            if (x == num) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("right");
        }else {
            System.out.println("Wrong");
        }
    }
}

