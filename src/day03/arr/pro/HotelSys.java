package day03.arr.pro;

import java.util.Scanner;

public class HotelSys {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("酒店管理系统");
        System.out.println("1.查看房间");
        System.out.println("2.订房");
        System.out.println("3.退房");
        System.out.println("4.exit");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的选项：");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    hotel.printR();
                    break;
                case 2:
                    System.out.println("请输入房间编号 ");
                    int no = sc.nextInt();
                    hotel.order(no);
                    System.out.println("预定成功");
                    break;
                case 3:
                    System.out.println("请输入房间编号 ");
                    int no2 = sc.nextInt();
                    hotel.exit(no2);
                    System.out.println("退房成功");
                    break;
                case 4:
                    System.out.println("bye bye");
                    return;
                default:
                    System.out.println("over");
            }
        }
    }
}
