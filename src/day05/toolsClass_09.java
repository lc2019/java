package day05;

import java.util.Arrays;

class StaticTest {
    static {
        System.out.println("静态代码块");
    }

    public static void test() {
        System.out.println("静态成员方法");
    }
}

public class toolsClass_09 {
    public static void main(String[] args) {
        int[] num = {1, 4, 2, 3, 7, 4, 3};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


        StaticTest staticTest = new StaticTest();
        StaticTest.test();

    }

}
