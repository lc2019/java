package day03;

import java.util.Scanner;

/**
 * 方法的返回值
 */
public class meth_03 {
    public static void main(String args[]){
        //调用方法,接收返回值
        boolean bool = isRunNian(2000);
       if (bool){
           System.out.println("runnian");
       }else {
           System.out.println("pingnian");
       }

       print();//1,2,3,4

        Scanner input =  new Scanner(System.in);
        System.out.println("等腰三角形边长：");
        int num = input.nextInt();
        prttr(num);
    }

    public static boolean isRunNian(int year){
        if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            return true;
        }else {
            return false;
        }
    }

    public  static  void print(){
        for (int j = 1; j <10 ; j++) {
            if (j == 5){
                return;
            }
            System.out.println(j);
        }
    }

    //等腰三角形
    public  static  void prttr(int line){
        //控制行数
        for (int i = 1; i <= line; i++) {
            //控制输出空格
            for (int j = i; j <line ; j++) {
                System.out.print(" ");
            }
            //输出*
            for (int j = 1; j <=i*2 -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
