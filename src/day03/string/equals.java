package day03.string;

import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        String username = "lc";
        String password = "2020";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)){
                System.out.println("登陆成功");
                break;
            }else {
                if (2-i==0){
                    System.out.println("锁定");
                }else {
                    System.out.println("登陆失败还有"+(2-i)+"次机会");
                }
            }
        }
    }
}
