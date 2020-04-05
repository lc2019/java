package day04;

//定义类
class Person {
    String name;
    int age;
    boolean gender;

    //成员方法
    public void eat() {
        System.out.println("chifan");
    }

    public void coding() {
        System.out.println("duo qiao dai ma");
    }

    public Person() {
    } //无参数的构造方法

    //构造方法-初始化当前类的对象
    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class mxdx_02 {
    public static void main(String[] args) {
        //初始化类 类名 类对象= new 类名
        Person p = new Person("lulu", 18, true);
        p.name = "lc";
        System.out.println(p.name + " " + p.age + " " + p.gender);
        //方法调用
        p.coding();
    }

}
