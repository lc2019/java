package day05.quanxianxiushifu;
// private只有本类可以访问

class Per {
    String name;
    private int age;

    static String country = "中国";

    public Per() {
    }

    //静态的方法访问静态的变量
    public static void testStaicMethod() {
        System.out.println("静态成员方法");
    }
}

public class xiushi_08 {
    public static void main(String[] args) {
        Per per = new Per();
        per.name = "lc";
//        per.age = 18;
        System.out.println(per.name + Per.country);
        //类名+方法
        Per.testStaicMethod();
    }
}
