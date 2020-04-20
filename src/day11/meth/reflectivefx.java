package day11.meth;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 反射越过泛型检查
 */
public class reflectivefx {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        //获取类对象
        Class<? extends ArrayList> c = arr.getClass();
        //获取方法
        Method m1 = c.getDeclaredMethod("add", Object.class);
        //通过方法设置
        Object o1 = m1.invoke(arr, "lc");
        Object o2 = m1.invoke(arr, "2020");
        System.out.println(arr);
    }
}
