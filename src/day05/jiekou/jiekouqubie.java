package day05.jiekou;

/*
行为抽象
 */
interface alarm {
    void alarm();
}

/**
 * 抽象类是食物的抽象，接口时行为的抽象
 */
public class jiekouqubie extends door implements alarm {
    @Override
    public void open() {
        System.out.println("kaimen");
    }

    @Override
    public void close() {
        System.out.println("guanmen");
    }

    @Override
    public void alarm() {
        System.out.println("告警实现");
    }

    public static void main(String[] args) {

    }
}
