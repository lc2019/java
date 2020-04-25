package day16.Map;
//存储自定义类型

import java.util.HashMap;

public class diytype {
    public static void main(String[] args) {
        HashMap<orange, String> map = new HashMap<>();
        orange o1 = new orange("choubaguai", "8");
        orange o2 = new orange("xiaotangju", "8");
        orange o3 = new orange("chengzi", "8");
        orange o4 = new orange("jinqianju", "8");

        map.put(o1, "shanxi\n");
        map.put(o2, "tianmen\n");
        map.put(o3, "jiuzhen\n");
        map.put(o4, "hubei\n");

        System.out.println(map);
    }
}
