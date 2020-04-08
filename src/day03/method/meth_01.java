package day03.method;

public class meth_01 {
    //程序入口
    public static void main(String[] args) {
        priHello();
        priInt(10);
        int res = revInt();
        System.out.println(res);

        int num = onePlus(10);
        System.out.println(num);

        System.out.println(isUp('s'));

        System.out.println(isLow('A'));
        System.out.println(isLow('a'));
        System.out.println(isLow('0'));
    }

    /**
     * @author:lc 2020年04月04日11:51:58
     * 打印hello
     */
    //权限修饰符  static 方法 void无返回值 方法名()
    public static void priHello() {
        System.out.println("hello world");
    }

    //有参数的方法
    public static void priInt(int x) {
        System.out.println(x);
    }

    //无参数有返回值的方法 返回值类型
    public static int revInt() {
        return 10;
    }

    //有返回值有参数的方法
    public static int onePlus(int x) {
        return x + 1;
    }

    public static boolean isUp(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /**
     * @param c 小写
     * @return 大写
     */
    public static char isLow(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 'a' - 'A'; //32
        }
        return c;
    }
}

