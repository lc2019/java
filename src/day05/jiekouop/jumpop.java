package day05.jiekouop;


public class jumpop {
    //接口作为形参
    public void usejump(T t) {
        t.jump();
    }

    public T getjunp() {
        //接口不能直接实例化，采用多态的方式 通过实现类来进行初始化
        T t = new People();
        return t;
    }
}
