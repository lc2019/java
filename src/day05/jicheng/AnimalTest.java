package day05.jicheng;

public class AnimalTest {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("buou");
        c1.setAge(1);

        System.out.println(c1.getName()+c1.getAge());
        c1.work();


    }
}
