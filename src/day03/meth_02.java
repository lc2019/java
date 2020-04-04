package day03;

import java.util.Scanner;

/**
 * 方法的参数
 *  形参 实参
 */
public class meth_02 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入打印*的行数：");
        int line = input.nextInt();
        //实参，形参实参可以不一样
        printStar(line);
    }

    public static void printStar(int line){
        for (int i = 0; i <line ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
