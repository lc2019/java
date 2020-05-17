package day04.mxdxDemo1;

/**
 * 电脑的属性
 */
public class computer {
    private boolean screenShow;

    public computer() {
    }

    public computer(boolean screenShow) {
        this.screenShow = screenShow;
    }

    public boolean isScreenShow() {
        return screenShow;
    }

    public void setScreenShow(boolean screenShow) {
        this.screenShow = screenShow;
    }

    public void computerRun() {
        if (screenShow) {
            System.out.println("run......");
        } else {
            System.out.println("lanping");
        }
    }
}
