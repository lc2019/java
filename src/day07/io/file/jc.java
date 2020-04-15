package day07.io.file;

public class jc {
    public static void main(String[] args) {
        System.out.println(jc(5));
    }

    public static int jc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
