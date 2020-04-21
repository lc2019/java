package day12.review;

/**
 * 类的五大成分：
 * 1.成员变量
 * 2.成员方法
 * 3.构造器-初始化对象的格式
 * 4.代码块
 * 5.内部类
 * <p>
 * this
 * 代表当前对象的引用
 * 实例方法和构造器
 * this中的方法,谁使用代表谁
 * 构造器代表初始化对象的引用
 */
public class ClassDemo1 {
    public static void main(String[] args) {
        Animal dw = new Animal();
        dw.setName("阿拉斯加");
        System.out.println(dw.getName());

        Animal a2 = new Animal("erha", 2, 'm');
        System.out.println(a2.getName());


    }


}

class Animal {
    private String name;
    private int age;
    private char sex;


    public Animal() {
    }

    public Animal(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    /**
     * 获取
     *
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
