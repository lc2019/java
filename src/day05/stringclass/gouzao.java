package day05.stringclass;

/**
 * string的方法
 */
public class gouzao {
    public static void main(String[] args) {
        //charAt
        char c = "你好".charAt(1);
        System.out.println(c);
        //compareTo
        System.out.println("abc".compareTo("abd"));
        //contains
        System.out.println("abc".contains("a"));
        //replace
        System.out.println("abcd".replace("abc", "bc"));
        //valueOf

        // endsWith
        System.out.println("abc".endsWith("d"));

        
    }
}
