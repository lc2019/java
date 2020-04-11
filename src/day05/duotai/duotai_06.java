package day05.duotai;
//父类的引用指向子类，接口的引用指向实现接口的实现类对象
/*
重写和继承
变量都是看左边-父类
方法看右边-子类的方法-因为有重写
 */


class Cat extends Animal {
    public int age = 1;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void play() {
        System.out.println("zuomaobu");
    }
}

class Dog extends Animal {


    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

public class duotai_06 {
    public static void main(String[] args) {

        //多态
        Animal c1 = new Cat();//向上转型
        System.out.println(c1.age); //2
        c1.eat(); //猫吃鱼

        Dog dog = new Dog();


        //抽象类不能直接实例化，多态通过子类来创建
        Animaleat anie = new Animaleat();
        anie.useAnimal(c1);
        anie.useAnimal(dog);

        Animal c2 = anie.getAnimal();
        c2.eat();

        //向下转型 父类引用子类
        Cat c = (Cat) c1;
        c.eat();
        c.play();

        //父类调用
        ((Cat) c1).play();

    }

}
