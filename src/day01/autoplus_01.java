package day01;

public class autoplus_01 {
    public static void main(String[] args) {
        int num = 10;
//        int res = num++ * num;
        int res = num * num++; //先运算在++
        System.out.println("res = " + res); //100
        System.out.println("num = " + num); //11
    }

}
