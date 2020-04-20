package day11.meth;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取成员变量并赋值
 */
public class getMethodAssign {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取class对象
        Class<?> c = Class.forName("day11.fanshe.stu");

        //获取构造方法
        Constructor<?> cst = c.getConstructor();

        //创建对象
        Object o1 = cst.newInstance();
        System.out.println(o1);

        //获取所有成员变量-name
        Field f = c.getDeclaredField("name");

        //设置成员可以访问私有属性
        f.setAccessible(true);
        //设置成员变量的值
        f.set(o1, "lc");
        System.out.println(o1);

        Field f2 = c.getDeclaredField("age");
        f2.setAccessible(true);
        f2.set(o1, 20);
        System.out.println(o1);

        Field f3 = c.getDeclaredField("address");
        f3.setAccessible(true);
        f3.set(o1, "tianmen");
        //stu{name='lc', age=20, address='tianmen'}
        System.out.println(o1);
    }
}
