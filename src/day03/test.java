package day03;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] nums = new int[5];

        Scanner input = new Scanner(System.in);

        Random r = new Random();

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = r.nextInt(50);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("enter a num");
        int num = input.nextInt();
        boolean flag = false;
        for (int x : nums) {
            if (x == num) {
                flag = true;
                break;
            }
        }


        if (flag) {
            System.out.println("r");
        } else {
            System.out.println("w");
        }
    }
}
