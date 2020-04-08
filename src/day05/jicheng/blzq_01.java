package day05.jicheng;
/*
封装
 */
class People {
    //私有属性的操作方法 getter and setter
    private String name;
    private int age;
    char gender;

    public People() {
    }

    public People(String name, int age, char gender) {
        //this调用当前方法的类对象，必须第一行
        this();//根据实际参数的值来选择调用的构造
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

public class blzq_01 {
    public static void main(String[] args) {
        People p = new People();
        p.setName("lc");
        System.out.println(p.getName());

    }


}
