package day12.oop;

public class Demo5 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger("ala", 1);
        System.out.println();

    }
}


class Tiger extends Dw {
    public Tiger() {
        //默认有一行 super();根据参数取匹配父类的构造器
        System.out.println("子类构造器");
    }

    /**
     * 父类的有参数构造器
     *
     * @param name
     * @param age
     */
    public Tiger(String name, int age) {
        super(name, age);
    }


}

class Dw {
    private String name;
    private int age;

    public Dw() {
        System.out.println("父类构造器");
    }

    public Dw(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Dw{name = " + name + ", age = " + age + "}";
    }
}