package day18.方法引用;

import java.util.Arrays;
import java.util.Comparator;

public class compare {
    public static void main(String[] args) {
        String[] arr = new String[]{"ll", "Lc", "LULU"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //忽略大小写
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
