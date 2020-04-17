package day07.properties;

import java.util.Properties;
import java.util.Set;

/**
 * 作为集合使用，方法
 */
public class demo1 {
    public static void main(String[] args) {
        Properties pro = new Properties();

        //存储元素
        pro.put("01", "lc");
        pro.put("02", "lzc");
        pro.put("03", "lcc");

        //kv类型
        Set<Object> keys = pro.keySet();
        for (Object key :
                keys) {
            System.out.println(key + "," + pro.get(key));
        }

        pro.setProperty("04", "lulu");
    }
}
