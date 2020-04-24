package day14.usb;

/**
 * 混合案例
 * 多态 引用类型传递
 */
public class demo1 {
    public static void main(String[] args) {
        Computer c = new Computer();
        Mouth xiaomi = new Mouth("小米");
        c.Install(xiaomi);

        Keyboard sfy = new Keyboard("sfy");
        c.Install(sfy);
    }
}

/**
 * 多态父类作为形参
 */
class Computer {
    public void Install(Usb usb) {
        usb.Connect();
        /**
         * 类型转行
         */
        if (usb instanceof Mouth) {
            Mouth m = (Mouth) usb;
            m.dbclick();
        } else if (usb instanceof Keyboard) {
            Keyboard k = (Keyboard) usb;
            k.code();
        }
        usb.Unconnect();
    }
}

class Mouth implements Usb {
    private String name;

    public Mouth(String name) {
        this.name = name;
    }

    public void dbclick() {
        System.out.println(name + "双击666");
    }

    @Override
    public void Connect() {
        System.out.println(name + "接入设备");
    }

    @Override
    public void Unconnect() {
        System.out.println(name + "拔出设备");
    }
}

class Keyboard implements Usb {
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public void code() {
        System.out.println(name + "coding...");
    }

    @Override
    public void Connect() {
        System.out.println(name + "接入设备");
    }

    @Override
    public void Unconnect() {
        System.out.println(name + "拔出设备");
    }
}

interface Usb {
    void Connect();

    void Unconnect();
}