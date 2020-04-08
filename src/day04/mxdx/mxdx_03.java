package day04.mxdx;

class singleDog {
    int age;

    {
        //构造代码块
        System.out.println("danshengou lei");
    }

    //默认的构造
    public singleDog() {
        System.out.println("moren danshengou");
    }

    //有参数的构造
    public singleDog(int age) {
        this.age = age;
        System.out.println("自定构造");
    }
}

public class mxdx_03 {
    public static void main(String[] args) {
        singleDog s1 = new singleDog();
        singleDog singleDog = new singleDog(18);


    }
}
