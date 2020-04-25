package day14.Object2;

import java.util.Objects;

public class ToString {
    public static void main(String[] args) {
        /**
         * 默认输出对象名称
         */
        stu s1 = new stu("lc", 20, 'm');
        stu s2 = new stu("lc", 20, 'm');
        System.out.println(s1.toString());

        System.out.println(s1.equals(s2));

        /**
         *     public static boolean equals(Object a, Object b) {
         *         return (a == b) || (a != null && a.equals(b));
         *     }
         */
        System.out.println(Objects.equals(s1, s2));


    }
}
