package day07.properties;

import java.util.Random;
import java.util.Scanner;

public class Guessnum {
    private Guessnum() {

    }

    static void start() {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a num:");
            int guess = sc.nextInt();

            if (guess > num) {
                System.out.println("dale");
            } else if (guess < num) {
                System.out.println("xiaole");
            } else {
                System.out.println("right");
                break;
            }
        }
    }
}
