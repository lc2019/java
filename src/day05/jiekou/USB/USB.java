package day05.jiekou.USB;

public interface USB {
    void connect();
}

/**
 * 鼠标
 */
class Mouse implements USB {
    @Override
    public void connect() {
        System.out.println("逻辑鼠标");
    }
}

/**
 * 键盘
 */
class Keyboard implements USB {
    @Override
    public void connect() {
        System.out.println("机械键盘");
    }
}

class logi extends Mouse {
    @Override
    public void connect() {
        System.out.println("罗技");
    }
}

class hdc extends Keyboard {
    @Override
    public void connect() {
        System.out.println("海盗船");
    }
}
