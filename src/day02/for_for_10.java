package day02;
/*
打印图形-双重循环
*
**
***
****
*****

 */
public class for_for_10 {
    public static void main(String args[]){
       //外循环控制行数
        for (int i = 0; i < 5 ; i++) {
            //内循环控制列数
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");//没列打印的*与的值相同
            }
            System.out.println();

        }

        //99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + "*" + i + "=" + j*i+"\t"); //加入制表符
            }
            System.out.println();//换行
        }
        
        
        //右三角
        //    *  4个空格，1个*
        //   **  3个空格，2个*
        //  ***
        // ****
        //*****

        //空格+*，分别打印
        for (int i = 0; i <=5 ; i++) {
            for (int j = 5; j > 0 ; j--) {
                if (j <= i){
                    System.out.print("*");//打印*
                }else {
                    System.out.print(" ");//打印空格
                }
            }
            System.out.println();
        }

        //打印等腰三角形
//            *  4空格 1*
//           *** 3空格 3*
//          *****  2空格 5*
//         *******
//        *********
        for (int i = 1; i <= 5 ; i++) {
            //内循环输出空格
            for (int j = i; j < 5 ; j++) {
                System.out.print(" ");
            }
            //输出*
            for (int j = 1; j <= i * 2 -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();//换行
        }


        //右三角
//     *
//     **
//     ***
//     ****
//     *****

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                //内循环输出空格
                System.out.print(" ");
            }
            for (int j = 1; j <=i  ; j++) {
                //内循环输出*
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}


