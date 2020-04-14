package day06.map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class tongjizifu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        //如果输出需要排序可以使用treemap
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            //根据字符的索引得到char
            char c = s.charAt(i);
            //根据字符得到值 k-v的形式存储
            Integer v = m.get(c);

            if (v == null) {
                //如果没有出现则值为1
                m.put(c, 1);
            } else {
                //如果key存在，值++
                m.put(c, v++);
            }
        }

        StringBuilder sbr = new StringBuilder();
        Set<Character> keySet = m.keySet();
        for (Character ch : keySet) {
            Integer iv = m.get(ch);
            //输出格式拼接
            sbr.append(ch).append("(").append(iv).append(")");
        }
        String res = sbr.toString();
        System.out.println(res);
    }
}
