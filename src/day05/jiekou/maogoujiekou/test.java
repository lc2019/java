package day05.jiekou.maogoujiekou;

public class test {
    public static void main(String[] args) {
        //创建对象调用方法，实现类来创建接口
        cat c = new cat();
        c.jmp();
        c.eat();

        //多态
        Animal a = new cat();
        a.setName("buou");
        a.setAge(1);
        a.eat();
//        a.jmp(); 不能调用接口的方法因为是animal
        a = new cat();
        a.eat();

    }
}
