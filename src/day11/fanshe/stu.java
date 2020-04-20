package day11.fanshe;

public class stu {
    private String name;
    private int age;
    public String address;

    public stu() {
    }

    public stu(String name) {
        this.name = name;
    }

    public stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public stu(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    private void f1() {
        System.out.println("func");
    }

    private void f2(String s) {
        System.out.println("func" + "," + s);
    }

    private void f3(String s, int i) {
        System.out.println("func" + s + "," + i);
    }

    private String f4(String s, int i) {
        return "func" + s + "," + i;
    }
}
