package day06.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        HashMap<String, String> m1 = new HashMap<>();

        //添加
        m1.put("01", "lc");
        m1.put("02", "lzc");
        m1.put("03", "ll");
        m1.put("04", "lcx");
        m1.put("05", "lcc");

        System.out.println(m1);

        //containkey,containvalue size
        System.out.println(m1.containsKey("01"));
        System.out.println(m1.containsValue("lc"));
        System.out.println(m1.size());

        //获取
        System.out.println(m1.get("01"));
        //获取键的集合
        System.out.println(m1.keySet());
        //获取值的集合
        System.out.println(m1.values());

        for (String v :
                m1.values()) {
            System.out.println(v);
        }

        for (String k :
                m1.keySet()) {
            System.out.println(k + "," + m1.get(k));
        }

        //kv集合的方式来遍历
        Set<Map.Entry<String, String>> e1 = m1.entrySet();
        for (Map.Entry<String, String> m2 :
                e1) {
            String key = m2.getKey();
            String value = m2.getValue();
            System.out.println(key + "," + value);
        }
    }
}
