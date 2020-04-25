package day14.date;

import java.util.Date;

public class date {

    public static void main(String[] args) {
        /**
         * 日期对象
         */
        Date d1 = new Date();
        System.out.println(d1);

        long start = d1.getTime();
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            sum += i;
            System.out.println(sum);
        }
        long end = d1.getTime();

        System.out.println((end - start) / 1000.0);
    }

}
