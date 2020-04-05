package day04;

/*
查找过程
1 3 5 7 9 11 13 15 17 19 （经过排序的数组）
maxindex =9
minindex =0
(max + min)/2
midindex = 4
arr[mid] = 9 < 13 往右开始查找

minindex = midindex +1--5
maxindex = 9
midindex = 7
arr[mid] =15>13

maxindex = midindex -1 =6
minindex = 5
midindex = 5
arr[midindex] ==11<13
--minindex = midindex +1--6  //反复执行
arr[midindex] = 13 zhaodao
 */
public class erfenchazhao_04 {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 13, 13, 13, 15, 17, 19};
        int res = halfS(num, 13);
        System.out.println(res);
    }

    /**
     * 二分查找的实现
     *
     * @param arr
     * @return
     */
    public static int halfS(int[] arr, int find) {
        if (null == arr || arr.length == 0) {
            System.out.println("wuxiao");
            return -1;
        }

        int index = -1;
        int maxIndex = arr.length - 1;
        int minIndex = 0;
        int midIndex = (maxIndex + minIndex) / 2;

        while (minIndex <= maxIndex) {
            //查询中间数据小于给定的值
            if (arr[midIndex] < find) {
                //修改最小值
                minIndex = midIndex + 1;
            } else if (arr[midIndex] > find) {
                maxIndex = midIndex - 1;
            } else {
                //否则返回mid
                index = midIndex;
                break;
            }
            //修改mid的值
            midIndex = (maxIndex + minIndex) / 2;
        }
        return index;
    }
}
