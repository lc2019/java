package day02;

public class break_continue_02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (j % 4 == 0) {
                    break;
//                    continue;
                }
                System.out.print("in" + j);
            }
            System.out.print("out:" + i);
        }
        System.out.println();
    }
}
