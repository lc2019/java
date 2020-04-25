package day15.集合;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 排序
 */
public class treeset {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        //字符串首字母的编号进行排序
        names.add("jack");
        names.add("caocao");
        names.add("rose");
        names.add("lulu");
        names.add("tom");
        names.add("诸葛亮");
        System.out.println(names);

        //引用数据类型对象排序-比较器
        TreeSet<emp> emps = new TreeSet<>(new Comparator<emp>() {
            @Override
            public int compare(emp o1, emp o2) {
                /**
                 * 01比较者  02 被比较者
                 * 优先使用集合自带的规则
                 */
                return o2.getAge() - o1.getAge();
            }
        });
        emps.add(new emp("lc", 3000.0, 20));
        emps.add(new emp("ll", 7500.0, 23));
        emps.add(new emp("lcc", 9000.0, 21));
        /**
         * 指定排序的规则
         *  对象的类重写比较器
         *
         */
        System.out.println(emps);
    }
}
