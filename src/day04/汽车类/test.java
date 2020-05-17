package day04.汽车类;

public class test {
    public static void main(String[] args) {
        engine e1 = new engine("86", 1.5f);
        Tyre t1 = new Tyre("mql", 19);

        car c1 = new car(e1, t1);
        c1.show();
    }
}
