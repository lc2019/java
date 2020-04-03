package day01;

import java.util.Scanner;

/*
@author:lc
if(bool条件){
   code
}
 */
public class if_03 {
    public static void main(String[] args) {
        int money = 50;
        if (money > 5) {
            System.out.println("lanbojini");
        }
        System.out.println("over");

        //if else 结构
        if (money > 10) {
            System.out.println("youqian");
        } else {
            System.out.println("meiqian");
        }

        Scanner sc = new Scanner(System.in); //创建类
        System.out.println("请输入你的分数：");
//        sc.next() string
//        sc.nextLine().charAt() char
        int score = sc.nextInt(); //获取int
        if (score >= 90) {
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

