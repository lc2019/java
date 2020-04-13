package day06.fanxing;

/**
 * 泛型接口实现
 */
public class test3 {
    public static void main(String[] args) {
        fxinterimp<String> s1 = new fxinterimp<>();
        s1.show("haha");

        fxinterimp<Integer> i1 = new fxinterimp<>();
        i1.show(20);
    }
}
