package day11.meth;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取成员方法
 */
public class getFieldMethod2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取类对象
        Class<?> c = Class.forName("day11.fanshe.stu");

        //获取构造方法
        Constructor<?> cst = c.getDeclaredConstructor();


        //创建对象
        Object o1 = cst.newInstance();

        //获取成员方法
        Method m1 = c.getDeclaredMethod("f1");
        m1.setAccessible(true);

        m1.invoke(o1);

        //获取成员方法
        Method m2 = c.getDeclaredMethod("f2", String.class);
        //访问私有的成员变量
        m2.setAccessible(true);
        m2.invoke(o1, "lc");

        Method f4 = c.getDeclaredMethod("f4", String.class, int.class);
        f4.setAccessible(true);
        //带返回值的方法
        Object o2 = f4.invoke(o1, "lc", 20);
        System.out.println(o2);

    }
}
