package day03.string;

public class charat {
    public static void main(String[] args) {
        String str = "abc";
        //根据下标遍历字符串
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
