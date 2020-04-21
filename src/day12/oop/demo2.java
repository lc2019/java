package day12.oop;

/**
 * static
 * 实例成员变量
 * <p>
 * 静态方法
 */
public class demo2 {
    //static静态成员变量
    public static String name = "lc";
    //实例成员变量,类对象 必须先创建类
    private int age;
    private String address;

    public static void show() {
        System.out.println("haha");
    }

    public void play() {
        System.out.println("dota2");
    }

    public static void main(String[] args) {
        //类名.静态成员变量
        System.out.println(demo2.name);

        System.out.println(name);


        //类名+方法名
        demo2.show();

        //同一个类省略类名可以不写
        show();

        //实例方法
        demo2 d1 = new demo2();
        d1.play();
    }
}
