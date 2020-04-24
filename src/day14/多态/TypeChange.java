package day14.多态;

public class TypeChange {
    public static void main(String[] args) {
        Animals a = new Dog1();
        a.run();

        //动物变量转为dog1类型
        Dog1 d = (Dog1) a;

        /**
         * 真实类型判断
         * 变量 instanof 类型
         */
        Animals c = new Cat1();

        if (c instanceof Cat1) {
            Cat1 c1 = (Cat1) c;
            c1.run();
        } else if (c instanceof Dog1) {
            Dog1 d1 = (Dog1) d;
            d1.run();
        }
    }
}

class Animals {
    private String name;

    {
        setName("动物");
    }

    public void run() {
        System.out.println("跑起来");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog1 extends Animals {
    public String name = "al";

    @Override
    public void run() {
        System.out.println("阿拉斯加 ooo");
    }
}

class Cat1 extends Animals {
    @Override
    public void run() {
        System.out.println("走猫步");
    }
}