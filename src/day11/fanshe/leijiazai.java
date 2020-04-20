package day11.fanshe;

/**
 * 类加载器
 */
public class leijiazai {
    public static void main(String[] args) {
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);
        ClassLoader parent = c.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent(); //null java虚拟机
        System.out.println(parent1);
    }
}
