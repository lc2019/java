package day06.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/*
    定义学生类
    创建treeset集合对象，通过比较器排序进行排序
    创建学生对象
    把学生对象添加到集合
    遍历集合
 */
public class test2 {
    public static void main(String[] args) {
        TreeSet<stuscore> sc1 = new TreeSet<>(new Comparator<stuscore>() {
            @Override
            public int compare(stuscore s1, stuscore s2) {
                //this.  sc
                //总分的比较规则-主要条件
                int num = s2.getSum() - s1.getSum();
                //语文成绩  -次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                //名字比较
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        }
        );

        //创建学生类
        stuscore c1 = new stuscore("lc", 90, 100);
        stuscore c2 = new stuscore("lzc", 90, 90);
        stuscore c3 = new stuscore("lulu", 95, 98);
        stuscore c4 = new stuscore("leic", 90, 80);
        stuscore c5 = new stuscore("lcc", 100, 97);
        stuscore c6 = new stuscore("lc1", 97, 100);
        stuscore c7 = new stuscore("lc1", 97, 100);

        //添加学生类到集合
        sc1.add(c1);
        sc1.add(c2);
        sc1.add(c3);
        sc1.add(c4);
        sc1.add(c5);
        sc1.add(c6);
        sc1.add(c7);

        for (stuscore s :
                sc1) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath());
        }

    }
}
