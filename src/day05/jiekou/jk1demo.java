package day05.jiekou;

public class jk1demo {
    public static void main(String[] args) {
        //使用实现类对象来实例化接口
        jk2 jk = new jk2();
        jk.jmp();

        //接口成员变量访问，直接访问
        System.out.println(jk3.num);


    }
}
