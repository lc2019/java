package day02;

/*
斐波那契数列
 */
public class fbnq_09 {
    public static void main(String args[]) {
        int n1 = 1;
        int n2 = 1;
        int next = 0;
        //输出前2位数
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i < 8; i++) {
            //第三位数
            next = n1 + n2;
            System.out.print(next + " ");
            //next 与n2 交换
            n1 = n2;
            n2 = next;
        }
    }
}
