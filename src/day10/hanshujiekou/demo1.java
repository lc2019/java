package day10.hanshujiekou;

public class demo1 {
    /**
     * 有且只有1个抽象的接口
     * 只要满足条件都可以 建议加上注解
     */
    public static void main(String[] args) {
        itr i = () -> System.out.println("函数式接口");
        i.show();
    }
}
