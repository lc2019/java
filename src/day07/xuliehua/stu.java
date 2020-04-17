package day07.xuliehua;

import java.io.Serializable;

public class stu implements Serializable {
    public static final long serialVersionUID = 42L;
    private String name;
    private transient int age; //trans修饰的变量不参与序列化

    public stu() {
    }

    public stu(String name, int age) {
        this.name = name;
        this.age = age;
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

//    @Override
//    public String toString() {
//        return "stu{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
