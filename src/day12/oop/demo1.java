package day12.oop;

/**
 * oop:
 * 面向，继承，多态
 */
public class demo1 {
    public static void main(String[] args) {
        stu s1 = new stu();
        s1.setName("lc");
        s1.setAge(18);
        System.out.println(s1.getName());
    }
}

/**
 * 封装
 * private +get/setter
 */
class stu {
    private String name;
    private int age;

    public stu() {
    }

    public stu(String name, int age) {
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

}
