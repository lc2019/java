package day02;

import java.util.Scanner;

public class bijiaodaxiao_03 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num");
        int num1 = input.nextInt();
        System.out.println("enter a num again");
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println("num1 > num2:" + num1);
        }else if (num1 < num2){
            System.out.println("num2 > num1:" + num2);
        }else {
            System.out.println("num1 = num2");
        }
    }

}
