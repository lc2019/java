package day06;

//   泛型在类的使用

/**
 * @param <T>
 */
class test1<T> {
    public T getType(T t) {
        return t;
    }
}

public class fx_class_05 {
    public static void main(String[] args) {
        //传入string类型 返回string
        test1<String> objecttest1 = new test1<String>();

        String type = objecttest1.getType("123");
        System.out.println(type);

    }
}
