package day02;
/*
do while 先执行在判断
1.逆序输出10-0
 */
public class do_while_6 {
    public static void main(String args[]){
        int i = 10;
        do {
            //循环体
            System.out.println(i);//至少执行1次
            i--; //循环动作
        }while (i >= 0);//循环停止条件
    }
}
