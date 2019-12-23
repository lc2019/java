package day03;

/**
 * 二维数组
 */
public class arr_erwei_09 {
    public static void main(String[] args) {
        int[][] scores = {{78,80,90},{87,96,85},{63,78,89}};
        //二维数组的长度
        int class1 = scores.length;
        for (int i = 0; i <class1 ; i++) {
            int sum = 0;
            //一维数组的长度
            int count = scores[i].length;
            for (int j = 0; j <count ; j++) {
                sum += scores[i][i];
            }
            System.out.println(sum);
        }
    }
}
