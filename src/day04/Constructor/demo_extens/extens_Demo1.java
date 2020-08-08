package day04.Constructor.demo_extens;

public class extens_Demo1 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
//        new Zi(5);
    }
}

class Fu {
    public Fu() {
        show();
    }

    void show() {
        System.out.println("fu show");
    }
}

class Zi extends Fu {
    int num = 8;

    public Zi() {
    }

//    public Zi(int num) {
//        this();
//        System.out.println("num is :"+num);
//    }

    void show() {
        System.out.println("zi show.." + num);
    }
}
