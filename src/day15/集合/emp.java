package day15.集合;

import java.util.Comparator;

public class emp implements Comparable<emp> {
    private String name;
    private double salary;
    private int age;

    public emp() {
    }

    public emp(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
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
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
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
     * 重写比较器
     * 比较者 this
     * 被比较者 o
     * 根据年龄比较
     */
    @Override
    public int compareTo(emp o) {
//        if (this.age > o.age) {
//            return 1;
//        }
//        return 0;
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
