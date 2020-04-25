package day16.Map;

import java.util.HashMap;

/**
 * k-v键值对集合
 * api方法
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //添加元素
        map.put("lc", 20);
        map.put("ll", 30);
        map.put("leic", 40);
        map.put("lcc", 35);
        map.put("lzc", 90);
        //清空map
//        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);

        //根据键获取值
        System.out.println(map.get("lc")); //20

        //删除键，返回值
        System.out.println(map.remove("lzc"));

        //包含
        System.out.println(map.containsKey("ll"));
        System.out.println(map.containsValue(350));

        //无序不重复，获取键的集合 set
        System.out.println(map.keySet());

        //值集合 collection
        System.out.println(map.values());
        for (Integer v : map.values()) {
            System.out.println(v);
        }

        //集合的大小size，合并集合
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("2020", 2020);
        map2.put("bigdata", 7);
        //把maps的元素全部放到map
        map.putAll(map2);
        System.out.println(map);
    }
}
