package day03.string;

public class strbld {
    public static void main(String[] args) {
        String s  ="abc";
        //每次在堆区域都在创建
        s +="world";
        System.out.println(s);

        StringBuilder s1 = new StringBuilder();
        s1.append("abc");
        System.out.println(s1);
        StringBuilder s2 = s1.append(",haha");
        System.out.println(s2);

        System.out.println(s1==s2); //同1个对象
        //反转字符串
        System.out.println(s2.reverse());

        //StringBuilder与String相互转换
        String s3  = s2.toString();
        System.out.println(s3);

        //通过构造方法实现
        StringBuilder s4 = new StringBuilder(s);
        System.out.println(s4);

        System.out.println("=====");
        //拼接
        int[] arr= {1,2,3};
        s1.append("[");
        for (int i = 0; i < arr.length; i++) {
            //最后1个元素
            if (i == arr.length-1){
                s1.append(arr[i]);
            }else {
                //不说最后1个元素
                s1.append(arr[i]).append(",");
            }
        }
        s1.append("]");
        //转换成字符串
        String s5 = s1.toString();
        System.out.println(s5);
    }
}
