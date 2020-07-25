package day05.baozhuanglei;

/**
 * 字符串转int
 */
public class bzdemo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        Integer i2 = Integer.valueOf("100");
//       Integer i3=  Integer.valueOf("abc");
        System.out.println(i + i2);
//        System.out.println(i3);
        //转行为int
        System.out.println(i2.intValue());


        //int string的相互转行
        int num = 100;
        String s1 = "" + num;
        System.out.println(num);

        //string --int
        System.out.println(Integer.parseInt("200"));

        //interger --string
        String s2 = String.valueOf(num);
        System.out.println(s2);

        //string --intger
        int i4 = Integer.parseInt(s1);
        System.out.println(i4);
    }
}
