package day05.jiekou.pc;

//类的混合使用
public class Pc {
    //直接使用已经声明的类
    Screen screen;
    Keyboard keyboard;

    public Pc() {
    }

    /**
     * 构造方法
     *
     * @param screen   类对象
     * @param keyboard 类对象
     */
    public Pc(Screen screen, Keyboard keyboard) {
        this.screen = screen;
        this.keyboard = keyboard;
    }


    public void writeBug() {
        System.out.println(keyboard.getName() + "," + keyboard.getKeycount()
                + ',' + screen.getName() + screen.getSize());
    }
}
