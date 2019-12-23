package day03;

/**
 * 冒泡排序算法
 * 大的数字和后面的数字交换位置
 * 最后的位置就是最大的数
 * 1
 * 4,34,17,56,65,86
 * 2
 * 4,17,34,56,67,86
 */
public class mp_11 {
    public static void main(String[] args) {
        int[] nums = {34, 4, 56, 17, 86, 65};

        for (int i = 0; i <nums.length - 1 ; i++) {
            //最后一个数不需要在比较，每1轮流最后的结果
            for (int j = 0; j <nums.length - 1 -i ; j++) {
//                int temp= 0;
                //位置互换
                if (nums[j] > nums[j +1]){
                   nums[j] = nums[j] + nums[j+1];
                   nums[j+1] = nums[j] - nums[j+1];
                   nums[j] = nums[j] - nums[j+1];
                }
            }
        }

        //输出结果
        for (int n:nums) {
            System.out.println(n);
        }
    }
}
