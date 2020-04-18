package day08.shengchanxiaofei;

public class shengchanzhe implements Runnable {
    private Box b;

    public shengchanzhe(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            b.put(i);
        }
    }
}
