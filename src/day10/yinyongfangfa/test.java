package day10.yinyongfangfa;

public class test {
    public static void main(String[] args) {
        //重写了接口的方法，实现了字符串的转行方法
//        useitr(s -> Integer.parseInt(s)); //方法+接口重写-使用lamada

        //lamada表达式替代类方法的时候参数会全部传递给静态方法作为参数
        useitr(Integer::parseInt); //参数会传递进给静态方法
    }

    public static void useitr(itr i) {
        //传入参数
        int num = i.conv("66");
        System.out.println(num);
    }
}
