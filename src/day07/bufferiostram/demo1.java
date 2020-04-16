package day07.bufferiostram;

import java.io.UnsupportedEncodingException;

public class demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        byte[] bys = s.getBytes();
        //指定字符集
        String ss = new String(bys, "UTF-8");
        System.out.println(ss);
    }
}
