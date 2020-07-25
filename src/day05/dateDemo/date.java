package day05.dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        //输出当前日期
        System.out.println(d1);

        //创建sdf对象指定时间格式化字符串
        SimpleDateFormat sdf = new SimpleDateFormat("2020-07-24");
        //转换为字符串
        String s = sdf.format(d1);
        System.out.println(s);


        //字符串转为date
        String date = "2020-07-24";
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date d2 = sd.parse(date);
        System.out.println(d2);

        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);

        Date d3 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String s2 = sdf.format(d3);
        System.out.println(s2);
    }
}
