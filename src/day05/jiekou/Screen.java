package day05.jiekou;

public class Screen {
    //成员变量
    private String name;
    private float size;

    //构造方法

    public Screen() {
    }

    public Screen(String name, float size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void show() {
        System.out.println("gezhongzhanshi");
    }
}
