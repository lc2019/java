package day01;

import java.util.Scanner;

/*
switch (变量和表达式){}
 */
public class switch_04 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要喝什么：");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("kuaileshui");
                break; //跳出case，不然会继续往下执行
            case 2:
                System.out.println("nongfushanquan");
                break;
            case 3:
                System.out.println("kuaixian");
                break;
            default:
                System.out.println("baikaishui");
        }
    }
}
