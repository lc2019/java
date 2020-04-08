package day03.method;

public class meth_04_reload {
    public static void main(String args[]){
        int res = add(10, 20);
        System.out.println(res);
        double res1 = add(2, 20);
        System.out.println(res1);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    //必须类型不一致或参数不一致
    public static double add(float a, int b) {
        return a + b;
    }

}
