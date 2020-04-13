package day06.hashset;

public class Stu {
    public Stu(String s, int i) {

    }

    /**
     * 方法重写
     *
     * @return
     */
    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) {
        Stu s1 = new Stu("lc", 20);
        System.out.println(s1.hashCode());
        Stu s2 = new Stu("lc", 20);
        System.out.println(s2.hashCode());
        System.out.println("----");
        System.out.println("大家".hashCode());
        System.out.println("你好".hashCode());
        System.out.println("hello".hashCode());
    }
}
