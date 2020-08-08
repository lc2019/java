package day05.baozhuanglei;

public class chaixiangzhuangxiang {
    public static void main(String[] args) {
        //自动转为包装类
        Integer i = 100;
        i += 200;
        System.out.println(i);

        //包装类的最大最小值
        System.out.println(Integer.MAX_VALUE);

        Integer x = 100;

        System.out.println(i == x); //false   Integer x= new Integer(100); x保存的是地址
    }
}
