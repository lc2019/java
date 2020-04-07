package day04.pro1;

import java.util.Scanner;

/**
 * 菜单展示
 */
public class customview {
    private static Scanner sc = new Scanner(System.in);

    public void showMenu() {

        while (true) {
            System.out.println("===客户管理系统===");
            System.out.println("    1.添加客户");
            System.out.println("    2.修改客户");
            System.out.println("    3.删除客户");
            System.out.println("    4.展示客户");
            System.out.println("    5.退出");
            System.out.println("请根据提示输入您的选择:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    addCustom();
                    break;
                case 2:
                    modCustom();
                    break;
                case 3:
                    delCustom();
                    break;
                case 4:
                    showCustom();
                    break;
                case 5:
                    break;
            }
        }


    }

    private void addCustom() {
        System.out.println("添加客户");
    }

    private void modCustom() {
        System.out.println("修改客户");
    }

    private void delCustom() {
        System.out.println("删除客户");
    }

    private void showCustom() {
        System.out.println("展示客户");
    }

    public static void main(String[] args) {
        customview customview = new customview();
        customview.showMenu();
    }
}
