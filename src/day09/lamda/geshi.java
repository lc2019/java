package day09.lamda;

/**
 * () 类似方法
 * -> 要做的事情
 * {}代码块
 */
public class geshi {
    public static void main(String[] args) {
        new Thread(() ->
                System.out.println("线程驱动")).start();
    }


}
