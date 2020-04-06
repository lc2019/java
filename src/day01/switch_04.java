package day01;

import java.util.Scanner;

public class switch_04 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请点单：");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("kuaileshui");
                break; //退出
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
