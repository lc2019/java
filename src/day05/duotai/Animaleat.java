package day05.duotai;

public class Animaleat {
    //抽象类名作为参数
    public void useAnimal(Animal a) {
        // Animal a = new Dog
        System.out.println("抽象类名作为参数");
        a.eat();
    }

    //抽象类名作为返回值
    public Animal getAnimal() {
        // Animal a = new Dog
        Animal a = new Cat();
        System.out.println("抽象类名作为返回值");
        return a;
    }
}
