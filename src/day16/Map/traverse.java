package day16.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 遍历map
 */
public class traverse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //添加元素
        map.put("lc", 20);
        map.put("ll", 30);
        map.put("leic", 40);
        map.put("lcc", 35);
        map.put("lzc", 90);

        //1.通过key获取values
        Set<String> strings = map.keySet();
        for (String key : strings) {
            Integer itg = map.get(key);
            System.out.println(itg);
        }

        //2.enterset-Map.Entry<String, Integer>
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);

        }

        //3.lambda
        map.forEach((k, v) -> System.out.println(k + "," + v));
    }
}
