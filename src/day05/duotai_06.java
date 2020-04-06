package day05;
//父类的引用指向子类，接口的引用指向实现接口的实现类对象

class Animal {

}

class Cxy extends Animal {

}

class Cat extends Animal {

}

public class duotai_06 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        feed(animal);
        feed(new Cxy());
        feed(new Cat());
    }

    public static void feed(Animal animal) {
        //显示包名和类名
        System.out.println(animal.getClass());
    }
}
