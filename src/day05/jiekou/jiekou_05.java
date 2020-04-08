package day05.jiekou;

//接口
interface A {
    //缺省属性 public static final
    int num = 10;

    //默认abs
    public void test();

    default public void testDef() {
        System.out.println("默认方法");
    }

}

interface B {
    public void testB();
}

//一个类可以实现多个接口
class typeA implements A, B {
    @Override
    public void test() {
        System.out.println("重写test方法。遵守接口A实现的方法（abstract 默认修饰）");
    }

    @Override
    public void testB() {
        System.out.println("test B");
    }
}


public class jiekou_05 {
    public static void main(String[] args) {
        //实现
        typeA typeA = new typeA();
        typeA.test();
        typeA.testDef(); //直接调用default方法

        typeA.testB();

    }
}
