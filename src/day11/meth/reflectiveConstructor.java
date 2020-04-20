package day11.meth;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取反射的构造方法
 * ，通过构造方法来创建对象-反射
 */
public class reflectiveConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("day11.fanshe.stu");

        //构造方法的数组
        Constructor<?>[] cstru = c.getConstructors();
        for (Constructor cst : cstru) {
            System.out.println(cst);
        }

        //构造方法的参数个数和数据字节码文件
        Constructor<?> csts = c.getConstructor();
        Object o1 = csts.newInstance();
        System.out.println(o1);
    }

}
