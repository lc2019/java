package day03;

/**
 * 求数组中的最大值，最小值
 */
public class arr_meth_10 {
    public static void main(String[] args) {
        int[] num = {10,3,54,67,88,1,2};
        int res = max(num);
        System.out.println(res);

        int res1  = min(num);
        System.out.println(res1);
    }

    public static  int max(int[] num){
        int max = num[0];
        int len = num.length;
        for (int i = 0; i <len ; i++) {
            if (num[i] > max){
               max = num[i];
            }
        }
        return max;
    }

    public static  int min(int[] num){
        int min = num[0];
        int len = num.length;
        for (int i = 0; i < len ; i++) {
            if (  min > num[i]){
                min = num[i];
            }
              }
             return min;
    }
}
