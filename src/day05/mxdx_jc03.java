package day05;

//继承与方法重写，以及abs的使用
abstract class Father {
    public String name;
    public int age;

    private double salary;

    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Father() {
        System.out.println("无参构造");
    }

    //有参数的构造
    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //abstract修饰的方法必须重写,没有方法体和成员
    abstract public void aihao();

    public void work() {
        System.out.println("工程师");
    }

}

//继承父类
class Son extends Father {
    public int weight;

    public Son() {
        //调用父类的构造必须在首行,不能和this混合使用
        super("lc", 30);
        System.out.println("son 无参构造");
    }

    @Override
    public void aihao() {
        System.out.println("wanshuai abs");
    }

    public void game() {
        System.out.println("dota2");
    }

    //当出现与父类同名的方法 根据就近元则
    public void work() {
        System.out.println("kaixin");
    }

//    @Override
//    public void aihao() {
//        System.out.println("kanshu,xuexi");
//    }

    public void test() {

        System.out.println("test supper");
        //调用本类里面的work
        work();
        //调用父类的work
        super.work();
    }

    //重写父类的方法

    @Override
    public double getSalary() {
        System.out.println("kaixin");
        return super.getSalary();
    }
}

public class mxdx_jc03 {
    public static void main(String[] args) {
        Father father = new Father() {
            @Override
            //匿名类
            public void aihao() {
                //abstract 重写了父类的aihao方法
                System.out.println("xuexi");
            }
        };
        father.name = "lc";
        father.age = 30;
        father.work();
        System.out.println(father.name + father.age);

        //子类,调用的时候会自动调用父类的无参构造
        Son son = new Son();
        son.weight = 150;
        //父类的成员变量
        son.name = "lulu";
        son.age = 18;

        son.game();
        System.out.println(son.name + " " + son.age);


        //父类私有的属性不能调用,通过公有的get and set 调用
        son.setSalary(6000);
        //重写的方法
        System.out.println(son.getSalary());


        son.test(); //通过supper.work()来调用父类的方法

        son.aihao();
        //父类的abstract
        father.aihao();
    }
}
