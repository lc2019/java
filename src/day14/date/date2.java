package day14.date;

import java.util.Date;

/**
 * 有参的构造器 时间转为日期对象
 */
public class date2 {
    public static void main(String[] args) {
        /**
         * 日期对象
         */
        Date d2 = new Date();

        long l = d2.getTime() + 121 * 1000;

        /**
         * 毫秒值对象转换
         */
        Date d3 = new Date(l);
        System.out.println(d3);

    }
}
