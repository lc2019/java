package day02;

public class for_12 {
    public static void main(String[] args) {
        //控制行
        for (int i = 0; i < 5; i++) {
            //控制每一行打印的*
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印三角形
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印等腰三角形
        /*       l  _  *
         *       1  4  1
         ***      2  2  3
         *****     3  0  5
         */
        //控制行数
        for (int i = 0; i <= 5; i++) {
            //2.空格 等于行号 -1
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //3.* 与行号*2-1相同
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印等腰三角形 一半
        /*         l  _  *
         *       1  6  1
         ***      2  4  3
         *****     3  2  5
         *******    4  0  7

         *****     1  1  3
         ***      1  2  2
         *       2  3  1
         */
        //控制行数
        for (int i = 0; i <= 5; i++) {
            //上半部分
            //2.空格 等于行号 -1
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //3.* 与行号*2-1相同
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //下半部分 中间行为标志
        for (int i = 1; i <= 5 - 1; i++) {
            //空格个数=行号
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //*=2*i-1-i --与上半部分的行号关联
            for (int k = 1; k <= 2 * 5 - i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
