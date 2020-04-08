package day05.jicheng;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void work(){
        System.out.println("抓老鼠");
    }
}
