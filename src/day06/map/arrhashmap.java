package day06.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class arrhashmap {
    public static void main(String[] args) {
        //创建arrlist
        ArrayList<HashMap<String, String>> a1 = new ArrayList<>();

        //创建hashmap集合
        HashMap<String, String> m1 = new HashMap<>();
        //存放键值对到map里面去
        m1.put("lc", "ll");
        m1.put("lzc", "lulu");
        m1.put("lcc", "lul");

        //添加元素到arrlist里面
        a1.add(m1);

        //创建hashmap集合
        HashMap<String, String> m2 = new HashMap<>();
        //存放键值对到map里面去
        m1.put("lc1", "ll");
        m1.put("lzc1", "lulu");
        m1.put("lcc1", "lul");

        //创建hashmap集合
        HashMap<String, String> m3 = new HashMap<>();
        //存放键值对到map里面去
        m1.put("lc2", "ll");
        m1.put("lzc2", "lulu");
        m1.put("lcc2", "lul");

        //添加元素到arrlist里面，元素类型为map
        a1.add(m2);
        a1.add(m3);

        //先遍历arrlist，map类型的值
        for (HashMap<String, String> m : a1) {
            //在遍历map
            Set<String> ks = m.keySet();
            for (String s : ks) {
                System.out.println(s + "," + m.get(s));
            }
        }
    }
}
