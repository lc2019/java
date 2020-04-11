package day05.jiekou.maogoujiekou;

//继承annimal实现接口jmp
public class cat extends Animal implements jmp {
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jmp() {
        System.out.println("jmp 的接口重写 jmp");
    }

    @Override
    public void eat() {
        System.out.println("继承的方法重写 eat");
    }
}
