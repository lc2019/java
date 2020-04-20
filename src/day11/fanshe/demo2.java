package day11.fanshe;

/**
 * 获取class类的对象的3种方式：
 * 类的class属性获取
 * getclass()方法 Object
 * class的静态方法 forName
 */
public class demo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //同一个字节码文件
        Class<stu> c1 = stu.class;
        System.out.println(c1);

        Class<stu> c2 = stu.class;
        System.out.println(c2);

        stu s1 = new stu();
        System.out.println(s1.getClass());

        Class<?> c3 = Class.forName("day11.fanshe.stu");
        System.out.println(c3);
    }
}
