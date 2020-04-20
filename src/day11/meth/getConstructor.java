package day11.meth;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射的私有构造创建对象
 * setAccessible(true) 取消访问检查
 */
public class getConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取class对象
        Class<?> c1 = Class.forName("day11.fanshe.stu");
        //返回一个Constructor对象
        Constructor<?> dcstr = c1.getDeclaredConstructor(String.class);

        //默认私有的构造方法不能创建对象，通过取消访问检查来创建对象
        dcstr.setAccessible(true);
        //使用构造方法创建对象
        Object o1 = dcstr.newInstance("lc");
        System.out.println(o1);


    }
}
