package day06.treeset;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/*
   1.创建set集合
   2.创建随机数对象
   3.判断集合长度是否小于10
        是产生一个添加到集合
        回到3继续
   4.遍历集合
 */
public class demo2 {
    public static void main(String[] args) {
        //创建set集合
//        HashSet<Integer> i1  = new HashSet<>();
        TreeSet<Integer> i1 = new TreeSet<>();


        //创建随机数
        Random r = new Random();

        //判断集合长度是否小于10
        while (i1.size() < 10) {
            //产生1-20的随机数
            int num = r.nextInt(20) + 1;
            i1.add(num);
        }

        //遍历
        for (Integer i :
                i1) {
            System.out.println(i);
        }
    }
}
