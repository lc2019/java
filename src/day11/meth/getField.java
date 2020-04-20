package day11.meth;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class getField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //获取class对象
        Class<?> c = Class.forName("day11.fanshe.stu");

        //获取成员变量数组，获取所有的成员变量
        Field[] ss = c.getDeclaredFields();
        for (Field s : ss) {
            System.out.println(s);
        }
        //返回field对象，反应class对象表现的类或接口
        Field f = c.getField("address");

        //获取无参的构造方法创建对象
        Constructor<?> cst = c.getConstructor();

        //创建对象
        Object o1 = cst.newInstance();

        //set方法设置成员的指定值
        f.set(o1, "tianmen"); //给o1的成员变f复制为tianmen
        System.out.println(o1);

    }
}
