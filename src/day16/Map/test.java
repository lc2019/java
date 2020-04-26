package day16.Map;

import java.util.HashMap;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String:");
        String s = sc.nextLine();

        HashMap<Character, Integer> infos = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //根据索引取值
            char c = s.charAt(i);
            //使用contain来表示
            if (infos.containsKey(c)) {
                //根据键取值
                infos.put(c, infos.get(c) + 1);
            } else {
                infos.put(c, 1);
            }
        }
        System.out.println(infos);
    }
}
