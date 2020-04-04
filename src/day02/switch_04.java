package day02;

import java.util.Scanner;

/*
swtich(表达式){
    case 1:
     break
    }
    表达式返回值必须是 int byte char short
    case字句中必须是常量
    break用来中断
 */
public class switch_04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num1:");
        int num1 = input.nextInt();
        System.out.println("enter a num2");
        int num2 = input.nextInt();
        System.out.println("+-*/");
        String op = input.next();
        switch (op) {
            case "+":
                System.out.println("num1+num2=" + (num1 + num2));
                break;
            case "-":
                System.out.println("num1-num2=" + (num1 - num2));
                break;
        }
    }
}
