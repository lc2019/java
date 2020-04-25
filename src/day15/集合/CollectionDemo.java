package day15.集合;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器
 */
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lc1");
        list.add("lc2");
        list.add("lc3");
        list.add("lc4");
        System.out.println(list);

        //迭代器
        Iterator<String> itr = list.iterator();
        //获取下一个元素
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        //1循环读取  boolean hasNext();
        while (itr.hasNext()) {
            String s1 = itr.next();
            System.out.println(s1);
        }

        //2使用foreach遍历，元素类型 集合
        for (String s : list) {
            System.out.println(s);
        }

        //3lambda
        list.forEach(s -> System.out.println(s));
        //删除元素
        System.out.println(list.remove(1));
        //修改元素
        System.out.println(list.set(2, "lcc"));

        System.out.println(list);
    }
}
