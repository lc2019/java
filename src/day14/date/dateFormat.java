package day14.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SingleDateFormat
 * date日期对象-----字符串格式
 * 时间毫秒值---字符串格式
 * 字符串格式--date日期对象
 */
public class dateFormat {
    public static void main(String[] args) throws ParseException {
        String date = "2020-04-25 11:36:49";

        //1.字符串解析为日期对象-时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //2.解析日期对象-字符串转为时间对象
        Date p1 = sdf.parse(date);

        //3.Date获取毫秒值()
        long time = p1.getTime() + (24L * 60 * 60 + 15 * 60 * 60 + 30 * 60 + 29) * 1000;

        //4.毫秒格式转换字符串格式
        System.out.println(sdf.format(time));


    }
}
