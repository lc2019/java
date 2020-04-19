package day09.lamda;

public class test {
    public static void main(String[] args) {
        //匿名内部类
        usefli(new fly() {
            @Override
            public void feixiang(String s) {
                System.out.println(s);
                System.out.println("feiji");
            }
        });

        //lambda的使用
//        usefli((String s)->{
//            System.out.println(s);
//            System.out.println("feiji");;
//        });

        //只有1条语句的化可以省略{}；
        usefli(s -> System.out.println(s));
    }

    //接口参数
    public static void usefli(fly f) {
        //就是匿名内部类的s
        f.feixiang("飞起来");
    }

}
