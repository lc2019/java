package day06.treeset;

/**
 * Comparable 自然排序 实现接口类
 * 排序并且唯一性
 */
public class student implements Comparable<student> {
    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
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

    @Override
    public int compareTo(student s) {
//        return 0; //不比较
//        return  1; //升序
//        return -1; //倒叙
//        int num = this.age - s.age;  //当前元素和上一个比较
        int num = s.age - this.age; //上一个和当前比较
        //如果年龄相同比较姓名
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }
}
