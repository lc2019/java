package day08.scxfz;

public class xf implements Runnable {
    private Nnc n;

    public xf(Nnc n) {
        this.n = n;
    }

    @Override
    public void run() {
        while (true) {
            n.get();
        }
    }
}
