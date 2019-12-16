package day02;

import java.util.Scanner;

/*
if语句嵌套
@author lc
 */
public class if_elseif_02 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("输入成绩： ");
        int score = input.nextInt();
        //需要从大到小判断，顺序执行
        if (score >=90){
            System.out.println("a");
        }else if(score>= 80 && score <90){
            System.out.println("b");
        }else if (score >= 70 && score < 80){
            System.out.println("c");
        }else  if (score >= 60 && score <70){
            System.out.println("d");
        }else  if (score < 60){
            System.out.println("e");
        }


    }


}
