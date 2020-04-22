package day12.oop;


/**
 * 引用类型作为成员变量
 */
public class Demo7 {

    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.setName("lc");
        Addre a1 = new Addre("tianmen");
        s1.setAddr(a1);//传入引用对象

        System.out.println(s1.getAddr());
    }
}

class Addre {
    private String name;


    public Addre() {
    }

    public Addre(String name) {
        this.name = name;

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


}

class Stud {
    private String name;
    private Addre addr;

    public Stud() {
    }

    public Stud(String name, Addre addr) {
        this.name = name;
        this.addr = addr;
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
     * @return add
     */
    public Addre getAddr() {
        return addr;
    }

    /**
     * 设置
     *
     * @param addr
     */
    public void setAddr(Addre addr) {
        this.addr = addr;
    }

}