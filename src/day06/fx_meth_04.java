package day06;

/*
    泛型在方法的使用
 */
public class fx_meth_04 {
    public static void main(String[] args) {
        fx_class_05 t1 = test(new fx_class_05());

        String t2 = test("123");

        Integer t3 = test(123);

    }

    /**
     * 自定义泛型的方法,根据传入的类型返回对应的类型
     *
     * @param <T> 类型
     */
    public static <T> T test(T t) {
        System.out.println(t);
        return t;
    }
}
