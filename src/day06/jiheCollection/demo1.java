package day06.jiheCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * boolean	hasNext()
 * 如果迭代具有更多元素，则返回 true 。
 * E	next()
 * 返回迭代中的下一个元素。
 */
public class demo1 {
    public static void main(String[] args) {
        //1.创建集合对象
        Collection<String> c = new ArrayList<String>();
        //2.添加集合元素
        c.add("1");
        c.add("2");
        c.add("2");
        c.add("2");
        c.add("2");
        System.out.println(c);

        //remove
        c.remove("1");

        //长度
        System.out.println(c.size());

        //3.创建遍历迭代器

        Iterator<String> it = c.iterator();
//        public Iterator<E> iterator() {
//            return new ArrayList.Itr();
//        }

//        private class Itr implements Iterator<E> {
//            ....
        System.out.println(it.next());
        //遍历集合
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
