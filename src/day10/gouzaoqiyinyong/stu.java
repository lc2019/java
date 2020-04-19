package day10.gouzaoqiyinyong;

/**
 * 构造器引用
 */
public class stu {
    public static void main(String[] args) {
//        ussbr((name,age)->new stugz(name,age));

        //引用,参数全部传递给构造器，不需要创建类
        ussbr(stugz::new);
    }


    public static void ussbr(sbr s) {
        stugz s1 = s.build("lc", 20);
        System.out.println(s1.getName() + "," + s1.getAge());
    }
}
