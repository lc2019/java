package day02;
/*
使用循环实现阶乘求和
 */
public class jiechen_07 {
    public static void main(String args[]){
        int num =0;
        int i =1;
        //外层循环求和
        do {
            int j =1;
            int jc =1;
            //内存循环求阶乘
            while (j<=i){//内层循环终止条件
                jc *= j;
                j++;//内层循环动作
            }
            num += jc;
            i++; //外层循环动作
        }while (i <= 5);//外层循环终止条件
        System.out.println(num);
    }


}
