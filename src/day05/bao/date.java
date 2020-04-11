package day05.bao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1); //Sat Apr 11 21:05:40 CST 2020

        //日期时间格式，日期到字符串，字符串到日期
        SimpleDateFormat s1 = new SimpleDateFormat();
        String s = s1.format(d1);
        System.out.println(s);
        //时间格式字符串
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println(s2.format(d1));

        //字符串解析成时间
        String ss = "2020-04-11 21:11:20";
        Date d2 = s2.parse(ss);
        System.out.println(d2);
    }
}
