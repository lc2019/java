package day05.jiekou;

//jk2实现1jk1·
public class jk2 implements jk1, jk3 {
    @Override
    public void jmp() {
        System.out.println("重写jmp方法");
    }

    @Override
    public void test() {
        System.out.println("test 抽象方法");
    }
}
