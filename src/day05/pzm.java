package day05;

/**
 * 等腰三角形
 */

public class pzm {
    public static void main(String args[]){
        char[] cs = {'a','b','c','d','e','f','g'};
        int len = cs.length;

        //控制打印行数
        for (int i = 1; i <=len ; i++) {

            //打印空格
            for (int j = i; j <=len ; j++) {
                System.out.print(" ");
            }

            //打印字母
            for (int j = 1; j <=i*2 -1 ; j++) {
                System.out.print(cs[i-1]);
            }

            System.out.println();
        }


    }
}
