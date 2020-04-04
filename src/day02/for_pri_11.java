package day02;

import java.util.Scanner;

public class for_pri_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //与7相关的数
            if (i % 10 != 0 && i % 10 == 7) {
                System.out.println(i);
            }
        }
        int sum = 0;
        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num1:");
        num1 = sc.nextInt();
        System.out.println("enter a num2:");

        num2 = sc.nextInt();
        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
