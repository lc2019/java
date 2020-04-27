package day17.exception;

public class exception1 {
    public static void main(String[] args) {
        /**
         * 编译异常
         * 运行异常
         *   runtimeException
         *      arrindexoutofrange
         *      NUllpoint
         */
//        String name = null;
//        //NullPointerException
//        System.out.println(name.length());
//
//        int[] arr = {10, 2, 3};
//        //ArrayIndexOutOfBoundsException
//        System.out.println(arr[3]);

        //类型转行异常 ClassCastException
        Object s = "haha";
        Integer i = (Integer) s;

    }
}
