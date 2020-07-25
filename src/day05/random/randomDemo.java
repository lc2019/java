package day05.random;

import java.util.Random;

public class randomDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println(rd.nextInt());

        //生成指定范围的随机数0-20
        Random rr = new Random(21);
        System.out.println(rr);
    }
}
