package day06;

import java.util.ArrayList;

public class fanxing_03 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add("123");
        arrayList.add("false");
        System.out.println(arrayList);

        //object 需要强制转行
        String str = (String) arrayList.get(1);
        System.out.println(str);

        //约束数据类型，前后一致
        ArrayList<String> str1 = new ArrayList<String>();
        str1.add("123");
        str1.add("1233");

        //数据类型一致化
        String s = str1.get(0);
        System.out.println(s); //123

    }
}
