package day02;

/*
质数
count计数法和判断
 */
public class for_08 {
    public static void main(String args[]) {
        //质数
//        int count =0;
        for (int i = 2; i <= 100; i++) {
            boolean Flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { //是否有因数
                    Flag = false;
                    break;//如果有因数直接跳出循环
//                    count++;
                }
            }
            if (Flag) { //if(count ==2){}
                System.out.println(i);
            }
        }
    }
}
