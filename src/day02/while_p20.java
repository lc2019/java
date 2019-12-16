package day02;

public class while_p20 {
    public static void main(String args[]){
        //1.计算1-100的和
        int num = 0;
        int i = 1;
        while (i <= 100){ //停止条件
            num += i;
            i++;
        }
        System.out.println(num);


        //2.计算10的阶乘
        int j = 1;
        int k = 1;
        while (j <= 10){
            k *= i;
            j++;
        }
        System.out.println(k);

        //3.打印100以内的奇数和3的倍数
        int x = 1;

        while (x < 100){
            if (x % 2 == 0){
                System.out.println(x+"偶数");
            }else {
                System.out.println("奇数" + x);
            }
            if (x % 3 ==0){
                System.out.println("3的倍数"+ x);
            }
            x ++;
        }
    }
}
