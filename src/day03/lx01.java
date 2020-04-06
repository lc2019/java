package day03;

import java.util.Random;

public class lx01 {
    public static void main(String[] args) {
        Stu[] stus = new Stu[20];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Stu();
            stus[i].number = (i + 1);
            //[]1-6的随机数
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            //0-100的随机数
            stus[i].score = (int) (Math.random() * (100 - 0 + 1) + 1);
        }

//        for (int i = 0; i < stus.length; i++) {
//            if (stus[i].state == 3) {
//                System.out.println(stus[i].info());
//            }
//        }
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    //交换的是数组元素对象
                    Stu tmp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }
}

/**
 * 学生类
 */
class Stu {
    int number;
    int state;
    int score;


    public String info() {
        return "Stu{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
