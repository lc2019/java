package day10.classduixiang;

/**
 * 定义一个类
 * 定义1个接口
 * 测试类
 * lambda：接口   静态方法参数传递 实现方法重写
 * 应用方法
 * 类方法  创建类 (类的静态方法实现) 引用
 * 方法  lamada表达式替代类方法的时候,形式参数会全部传递给静态方法作为参数
 */
public class test {
    public static void main(String[] args) {
//        usepstr(s -> System.out.println(s.toUpperCase()));
        //创建对象
        prints prs = new prints();
        //引用对象的实例方法
        usepstr(prs::pstr);
    }


    //静态方法
    public static void usepstr(pstr p) {
        p.prints("hello world");
    }
}
