package day05.bao;

import java.text.ParseException;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        String s1 = dateUtils.datetoString(d1, "yyyy-mm-dd");
        System.out.println(s1);

        String s = "2017-1-1";
        Date d2 = dateUtils.Stringtodate(s, "yy-mm-dd");
        System.out.println(d2);
    }
}
