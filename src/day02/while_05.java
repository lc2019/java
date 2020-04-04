package day02;
/*
while，先判断在执行
 */

import java.util.Scanner;

public class while_05 {
    public static void main(String args[]) {
        //1.计算1-100的和
        int num = 0;
        int i = 1;
        while (i <= 100) { //停止条件
            num += i;
            i++;
        }
        System.out.println(num);


        //2.计算10的阶乘
        int j = 1;
        int k = 1;
        while (j <= 10) {
            k *= i;
            j++;
        }
        System.out.println(k);

        //3.打印100以内的奇数和3的倍数
        int x = 1;

        while (x < 100) {
            if (x % 2 == 0) {
                System.out.println(x + "偶数");
            } else {
                System.out.println("奇数" + x);
            }
            if (x % 3 == 0) {
                System.out.println("3的倍数" + x);
            }
            x++;
        }

        char ch = 'a';
        while ((ch <= 'z')) {
            System.out.print(ch + " ");
            ch += 1;
        }
        System.out.println();

        num = 72351;
        while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }
        order();
    }

    /**
     * 菜单
     */
    public static void order() {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请点餐：");
            System.out.println("1.羊肉串");
            System.out.println("2.大鸡腿");
            System.out.println("3.火锅");
            System.out.println("4.快乐水");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.羊肉串30");
                    //跳出case循环
                    break;
                case 2:
                    System.out.println("2.大鸡腿30");
                    break;
                case 3:
                    System.out.println("3.火锅100");
                    break;
                case 4:
                    System.out.println("4.快乐水3");
                    break;
                case 5:
                    flag = true;
                    break;
            }
            //跳出while循环
            if (flag) {
                System.out.println("xiadan");
                break;
            }
        }
    }
}
