package day08.shengchanxiaofei;

public class xiaofeizhe implements Runnable {
    private Box b;

    public xiaofeizhe(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        //一直取
        while (true) {
            b.get();
        }
    }
}
