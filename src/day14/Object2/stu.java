package day14.Object2;

import java.util.Objects;

public class stu {
    private String name;
    private int age;
    private char sex;

    public stu() {
    }

    public stu(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * 返回对象内容信息
     *
     * @return
     */
    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //谁调用this就代表谁，判断obj是否是学生类型
//        if (o instanceof stu) {
//            stu s1 = (stu) o;
//            if (this.name.equals(s1.name) && this.age == s1.age
//            && this.sex == s1.sex) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        stu stu = (stu) o;
        return age == stu.age &&
                sex == stu.sex &&
                Objects.equals(name, stu.name);
    }

}
