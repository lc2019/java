package day06.fanxing;

/**
 * 泛型类的定义和使用
 *
 * @param <T> 类型
 */
public class fxclass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    //泛型方法
//    public void show(T t){
//        System.out.println(t);
//    }

    //泛型方法
    public <T> void show(T t) {
        System.out.println(t);
    }
}
