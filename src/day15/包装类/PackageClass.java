package day15.包装类;

/**
 * 基本数据类型转换为类
 * 自动装箱拆箱
 */
public class PackageClass {
    public static void main(String[] args) {
        //字符串转为int
        String s = "123";
        int i1 = Integer.parseInt(s);
        System.out.println(i1);
        System.out.println(Integer.valueOf(s));

        Integer i = 10;
        System.out.println(i.toString());
    }
}
