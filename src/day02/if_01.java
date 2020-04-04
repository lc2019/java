package day02;
/**
 * @author:lcc time:23点57分 2019/12/19
 * if选择结构
 * if(布尔表达式){
 * 代码块
 * }
 * if lese
 * if(布尔表达式){
 * 代码块1
 * }else{
 * 代码块2
 * }
 * <p>
 * 多重if-有一个条件为true直接终止
 * *   if(布尔表达式){
 * *      代码块1
 * *   }else if{
 * *      代码块2
 * *  }else if{
 * <p>
 * }else{
 * <p>
 * }
 */

import java.util.Scanner;

//65-90 ascii
public class if_01 {
    public static void main(String[] args) {
        System.out.println("请输入数字: ");
        Scanner input = new Scanner(System.in);
        int shuru = input.nextInt();
        if (shuru >= 65 && shuru <= 90) {
            //数字转换成字符
            System.out.println("daxie" + (char) shuru);
        } else {
            System.out.println("xiaoxie" + (char) shuru);
        }

        //判断闰年
        System.out.println("请输入年份：");
        int num = input.nextInt();
        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
            System.out.println("runnian");
        } else {
            System.out.println("pingnian");
        }

        int res = max(10, 20);
        System.out.println(res);

    }

    //三目运算符
    public static int max(int x, int y) {
        return x > y ? x : y;
    }
}
