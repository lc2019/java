package day05.bao;

import java.util.Calendar;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year:");
        int year = sc.nextInt();

        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);

        //2月最后1日
        c.add(Calendar.DATE, -1);
        //获取这一天的输出
        int date = c.get(Calendar.DATE);
        System.out.println(year + "," + date);
    }
}
