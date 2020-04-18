package day08.scxfz;

//重写了runnal的方法
public class sc implements Runnable {
    private Nnc n;

    public sc(Nnc n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            n.put(i);
        }
    }
}
