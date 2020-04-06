package day05;

//接口
interface Usb {
    public void connect();
}

//接口实现
class Mouse implements Usb {

    @Override
    public void connect() {
        System.out.println("shubiao");
    }
}

//继承
class Lg extends Mouse {
    @Override
    public void connect() {
        System.out.println("luoji 200");
        ;
    }
}

class Jp implements Usb {
    @Override
    public void connect() {
        System.out.println("jianpan");
    }
}

class Dn {//定义1个Dn类 需要usb接口类

    public void UsbCon(Usb usb) {
        usb.connect();
    }

}

public class jiekou_07 {
    public static void main(String[] args) {
        Dn dn = new Dn();

        Mouse mouse = new Mouse();
        Jp jp = new Jp();

        //接口实现
        dn.UsbCon(jp);
        dn.UsbCon(mouse);

        //子类
        dn.UsbCon(new Lg());

    }
}
