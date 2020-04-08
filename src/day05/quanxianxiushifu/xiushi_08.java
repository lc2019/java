package day05.quanxianxiushifu;
//static

class Per {
    String name;
    int age;

    static String country = "中国";

    public Per() {
    }

    public static void testStaicMethod() {
        System.out.println("静态成员方法");
    }
}

public class xiushi_08 {
    public static void main(String[] args) {
        Per per = new Per();
        per.name = "lc";
        per.age = 18;
        System.out.println(per.name + Per.country);
        //类名+方法
        Per.testStaicMethod();
    }
}
