package day06.fanxing;

public class test2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("lc");

        teacher t1 = new teacher();
        t1.setAge(20);

        fxclass<String> s2 = new fxclass<String>();
        s2.setT("lzc");
        System.out.println(s2.getT());
        s2.show("hello");

        //泛型类随着传入的数据类型变化而变化
        fxclass<Integer> i1 = new fxclass<>();
        i1.setT(20);
        System.out.println(i1.getT());

        i1.show(10);

        fxclass fx = new fxclass();
        fx.show("goon");
        fx.show(2020);

    }
}
