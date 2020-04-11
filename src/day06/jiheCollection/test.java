package day06.jiheCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的应用
 */
public class test {
    public static void main(String[] args) {
        Collection<Stu> c = new ArrayList<Stu>();
        Stu s1 = new Stu("lc", 18);
        Stu s2 = new Stu("lzc", 28);
        Stu s3 = new Stu("ll", 19);

        //添加元素到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Stu> i = c.iterator();
        while (i.hasNext()) {
            Stu s = i.next();
            System.out.println(s.getName() + s.getAge());
        }
    }
}
