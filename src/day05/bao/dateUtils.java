package day05.bao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateUtils {
    private dateUtils() {
    }

    /**
     * 时间转字符串
     *
     * @param date
     * @param format
     * @return string
     */
    public static String datetoString(Date date, String format) {
        SimpleDateFormat s1 = new SimpleDateFormat(format);
        String s = s1.format(date);
        return s;
    }

    /**
     * 字符串转为时间
     *
     * @param s
     * @param format
     * @return date
     * @throws ParseException
     */
    public static Date Stringtodate(String s, String format) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat(format);
        Date d = s1.parse(s);
        return d;
    }
}
