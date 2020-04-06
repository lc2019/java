package day02;

import java.util.Scanner;

public class Lx_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int m = sc.nextInt();
        System.out.println("enter a num:");
        int n = sc.nextInt();

        int min = (m <= n) ? m : n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 & n % i == 0) {
                System.out.println("最大公约数:" + i);
                break;
            }
        }

        int max = (m >= n) ? m : n;
        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 & i % n == 0) {
                System.out.println("最小倍数:" + i);
                break;
            }
        }


    }

    public static void test() {
        for (int i = 1; i < 150; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.print("boz");
            }
            if (i % 7 == 0) {
                System.out.print("biz");
            }
            if (i % 5 == 0) {
                System.out.print("baz");
            }
            System.out.println();
        }
    }

}
