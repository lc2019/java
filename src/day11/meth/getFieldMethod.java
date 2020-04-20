package day11.meth;

import day11.fanshe.stu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取成员方法
 */
public class getFieldMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取类对象
        Class<?> c = Class.forName("day11.fanshe.stu");
        //获取所有的方法数组
        Method[] ms = c.getDeclaredMethods();

        for (Method m : ms) {
            System.out.println(ms);
        }

        //获取指定的方法,无参方法
        Method m1 = c.getMethod("f");
        m1.setAccessible(true);
        //获取构造方法
        Constructor<?> cst = c.getConstructor();

        //创建对象
        Object o1 = cst.newInstance();

        //调用对象的方法 调用obj的成员方法返回obj
        m1.invoke(o1);


    }
}
