package day11.meth;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class configrueFilerun {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties pro = new Properties();
        //读取数据
        FileReader fr = new FileReader("class.txt");
        //加载数据
        pro.load(fr);
        fr.close();
        /*
            className=day11.meth.student
            methodName=study
         */
        //获取数据
        String cn = pro.getProperty("className");
        //获取数据
        String mn = pro.getProperty("methodName");

        //获取类对象
        Class<?> c = Class.forName(cn);
        //获取构造方法
        Constructor<?> cst = c.getConstructor();
        //创建类对象
        Object o1 = cst.newInstance();
        //获取方法
        Method m = c.getMethod(mn);
        //调用
        m.invoke(o1);
    }
}
