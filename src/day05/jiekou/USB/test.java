package day05.jiekou.USB;

public class test {
    public static void main(String[] args) {
        PC pc1 = new PC();

        Mouse m1 = new Mouse();

        Keyboard k1 = new Keyboard();
        //接口对象
        pc1.usbConnect(m1);
        pc1.usbConnect(k1);

        //匿名内部类
        pc1.usbConnect(new logi());
    }
}

/**
 * 电脑使用通过usb接口使用usb设备
 */
class PC {
    public void usbConnect(USB usb) {
        usb.connect();
    }
}
