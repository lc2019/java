package day06.fanxing;

//   泛型在接口的使用
interface A<T> {
    //默认 public static final修饰需要初始化  T类型没有类型
    public void test(T t);
}

//确定了接口泛型的类型
class test<T> implements A<String> {
    @Override
    public void test(String s) {
        System.out.println(s);
    }
}

public class fx_inter_06 {
    public static void main(String[] args) {
        test<String> ot = new test<>();
        ot.test("123");
    }
}
