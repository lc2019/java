package day02;

/*
for的基本格式
 */
public class for_08 {
    public static void main(String args[]) {
        for (int i = 0; i < 20; i++) {
            if (i % 7 == 0 && i % 4 != 0) {
                System.out.println(i);
            }
        }
    }
}
