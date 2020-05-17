package day05.jiekou.pc;

class Car {
    private String name;
    private String color;
    private int wheelcount;

    public Car() {
    }

    public Car(String name, String color, int wheelcount) {
        this.name = name;
        this.color = color;
        this.wheelcount = wheelcount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelcount() {
        return wheelcount;
    }

    public void setWheelcount(int wheelcount) {
        this.wheelcount = wheelcount;
    }

    public void race() {
        if (4 == wheelcount) {
            System.out.println("kaizhe" + color + name + "200km");
        } else {
            System.out.println("qu xiuli");
        }
    }
}

public class mxdx_02 {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("bmw", "baise", 4);
        for (int i = 0; i < 5; i++) {
            car.race();
            Thread.sleep(1000);
        }
        System.out.println("luntai boom");

        Keyboard keyboard = new Keyboard("shuangfeiyan", 104);
        Screen screen = new Screen("jdf", 26.5F);
        Pc pc = new Pc(screen, keyboard);
        pc.writeBug();

        pc.screen.show();
        pc.keyboard.coing();
    }
}
