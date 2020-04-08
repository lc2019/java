package day03.string;

public class reverse {
    public static void main(String[] args) {
        String str = "abc";
        String s = "";
        //反转字符串
        for (int i = str.length()-1; i >=0; i--) {
            s +=str.charAt(i);
        }
        System.out.println(s);

        //通过sbd来实现反转
        StringBuilder s1 = new StringBuilder(str);
        s1.reverse().toString();
        System.out.println(s1);
    }
}
