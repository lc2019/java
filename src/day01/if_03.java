package day01;

import java.util.Scanner;

public class if_03 {
    public static void main(String[] args) {
        int money = 50;
        if (money > 5) {
            System.out.println("lanbojini");
        }
        System.out.println("over");

        //if else 
        if (money > 10) {
            System.out.println("youqian");
        } else {
            System.out.println("meiqian");
        }

        Scanner sc = new Scanner(System.in); //��ȡ��������
        System.out.println("����������");
//        sc.next() string
//        sc.nextLine().charAt() char
        int score = sc.nextInt(); //int
        if (score < 0 || score > 100) {
            System.out.println("shuru cuowu");
            //�˳�
            System.exit(0);
        } else if (score >= 90 && score <= 100) {
            System.out.println("xiuer");
        } else if (score >= 80 && score < 90) {
            System.out.println("good");
        } else if (score >= 70 && score < 80) {
            System.out.println("jiayou");
        } else if (score >= 60 && score < 70) {
            System.out.println("yiban");
        } else {
            System.out.println("bujige");
        }
    }
}

