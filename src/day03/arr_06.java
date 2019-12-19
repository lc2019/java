package day03;

public class arr_06 {
    public static void main(String args[]){
        int[] scores = {59,79,93,100};
        int len = scores.length;
        for (int i = 0; i <len ; i++) {
            int score = scores[i];
            System.out.println(score);
        }

        //forearch 打印
        //数组元素类型  变量：数组名
        for (int x : scores){
            System.out.println(x);
        }

        print(scores);
        }
        //可变参数作为数组使用
        public static void print(int ...x){
            for (int i = 0; i <x.length ; i++) {
                System.out.println(x[i]);
        }

    }
}
