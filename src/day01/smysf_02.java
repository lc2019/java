package day01;

import java.util.Scanner;

/**
@author:lc
三目运算符
 */
public class smysf_02 {
    public static void main(String[] args) {
        System.out.println("score: ");
        Scanner input =  new Scanner(System.in);
        int score = input.nextInt();
        //条件表达式？a:b ,条件为真返回a，否则返回b
        String s  = score >= 60 ? "及格":"挂科";
        System.out.println(s);

        int a = 100, b = 304,c=289;
        int max = a>b?a:b;
//         max = (a>b?a:b)>c?(a>b?a:b):c;
        max = max>c?max:c;
        System.out.println(max);
    }
}
