package day06.fanxing;

/**
 * 泛型接口的实现
 *
 * @param <T>
 */
public class fxinterimp<T> implements fxinter<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
