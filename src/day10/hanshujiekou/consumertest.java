package day10.hanshujiekou;

import java.util.function.Consumer;

/**
 * consume接口的lambda实例
 */
public class consumertest {
    public static void main(String[] args) {
        String[] arr = {"lc,20", "lulu,20"};
//        printInfo(arr,(String str)-> {
//            String name = str.split(",")[0];
//            System.out.println("姓名：" + name);
//        },(String str)-> {
//            Integer age = Integer.parseInt(str.split(",")[1]);
//            System.out.println("姓名：" + age);
//        });

        printInfo(arr, str -> System.out.println("姓名：" + str.split(",")[0]), str -> System.out.println("姓名：" + str.split(",")[1]));
    }


    //消费2次
    private static void printInfo(String[] strarr, Consumer<String> con1, Consumer<String> con2) {
        for (String str : strarr) {
            con1.andThen(con2).accept(str);
        }
    }
}
