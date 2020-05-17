package day04.mxdxDemo1;

public class test {
    public static void main(String[] args) throws InterruptedException {
        computer c = new computer();

        for (int i = 0; i < 5; i++) {
            c.computerRun();
            Thread.sleep(5);
        }
        c.setScreenShow(false);
        System.out.println("gg");

        Factory fc = new Factory("xx", "road1", "11");
        fc.repair(c);
        for (int i = 0; i < 5; i++) {
            c.computerRun();
            Thread.sleep(5);
        }
    }
}
