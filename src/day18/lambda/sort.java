package day18.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        List<Stu> stus = new ArrayList<>();
        Stu s1 = new Stu("lc", 20, '男');
        Stu s2 = new Stu("ll", 28, '女');
        Stu s3 = new Stu("lcc", 29, '男');
        Collections.addAll(stus, s1, s2, s3);

//        Collections.sort(stus, new Comparator<Stu>() {
//            /**
//             * this s1  o s2
//             * @param s1
//             * @param s2
//             * @return
//             */
//            @Override
//            public int compare(Stu s1, Stu s2) {
//                //降序 -1 1升序
//                return s1.getAge()-s2.getAge();
//            }
//        });
        //升序
        Collections.sort(stus, (o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //简化 省略类型；参数只有1个小括号  return 没有参数
        Collections.sort(stus, (o1, o2) -> o1.getAge() - o2.getAge());


        System.out.println(stus);
    }
}
