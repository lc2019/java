package day10.jiekou.fangfayinyong;

public class test {
    public static void main(String[] args) {
        /**
         * 接口
         *接口实现
         * lambda
         */
        //根据接口中的方法推导出来
//        usep(s -> System.out.println(s));

        //方法引用::
        usep(System.out::println);
    }

    public static void usep(prints p) {
        p.printstr("爱生活爱java");
    }
}
