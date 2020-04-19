package day10.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Stream<R> map(Function<? super T,? extends R> mapper)返回由给定函数应用于此流的元素的结果组成的流。
 * 这是一个intermediate operation 。
 */
public class demo7 {
    public static void main(String[] args) {
        ArrayList<String> manlist = new ArrayList<>();
        manlist.add("周星驰");
        manlist.add("周润发");
        manlist.add("刘德华");
        manlist.add("刘德华");
        manlist.add("吴京");
        manlist.add("李连杰");

        ArrayList<String> wlist = new ArrayList<>();
        wlist.add("张曼玉");
        wlist.add("刘亦菲");
        wlist.add("林青霞");
        wlist.add("迪丽热巴");
        wlist.add("古力娜扎");

        //取男前3名字3个字
//        Stream<String> m1 = manlist.stream().filter(s -> s.length() == 3).limit(3);
//        //女只有刘开头的
//        Stream<String> w2 = wlist.stream().filter(s -> s.startsWith("刘")).skip(1);
//      //合并2个stream
//        Stream<String> s3 = Stream.concat(m1, w2);

        //作为构造方法的参数创建成员对象
//        s3.map(actor::new).forEach(System.out::println);
//        s3.map(actor::new).forEach(p-> System.out.println(p.getName()));

        Stream.concat(
                manlist.stream().filter(s -> s.length() == 3).limit(3),
                wlist.stream().filter(s -> s.startsWith("刘")).skip(1)
        ).map(actor::new).forEach(p -> System.out.println(p.getName()));
    }
}
