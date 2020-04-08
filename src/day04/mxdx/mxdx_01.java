package day04.mxdx;

public class mxdx_01 {
    private int id;
    private String name;
    private int age;
    private String className;

    public mxdx_01() {
    }

    public mxdx_01(int id, String name, int age, String className) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "mxdx_01{" +
                "name='" + name + '\'' +
                '}';
    }
}
