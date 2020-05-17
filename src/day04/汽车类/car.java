package day04.汽车类;

public class car {
    private engine e;
    private Tyre t;

    public car() {
    }

    /**
     * 组成汽车
     *
     * @param e 引擎
     * @param t 轮胎
     */
    public car(engine e, Tyre t) {
        this.e = e;
        this.t = t;
    }

    public engine getE() {
        return e;
    }

    public void setE(engine e) {
        this.e = e;
    }

    public Tyre getT() {
        return t;
    }

    public void setT(Tyre t) {
        this.t = t;
    }

    public void show() {
        System.out.println(e.getName() + e.getCap() + t.getName() + t.getSize());
    }
}
