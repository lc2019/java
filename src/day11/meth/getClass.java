package day11.meth;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射方法获取构造对象
 */

public class getClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取字节码文件class
        Class<?> c1 = Class.forName("day11.fanshe.stu");
        //2.获取指定构造方法
        Constructor<?> cst = c1.getConstructor(String.class, int.class, String.class);

        //3.通过指定构造方法创建对象-反射
        Object o1 = cst.newInstance("lc", 20, "tianmen");
        System.out.println(o1);
    }
}
