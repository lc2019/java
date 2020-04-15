package day06.string;

public class zifuchuan_02 {
    public static void main(String[] args) {
        //常量空间
        String str1 = "羊肉羊串羊";
        String str2 = "羊肉串";
        //新的内存地址
        String str3 = new String("羊肉羊串羊");
        String str4 = new String(str1);

        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        System.out.println(str2 == str3); //false
        System.out.println(str1 == str4); //false

        //长度获取
        System.out.println(str1.length()); //3

        //根据字符串的索引获取字符
        System.out.println(str1.charAt(0)); //羊

        //根据字符获取索引
        System.out.println(str1.indexOf("羊")); //1
        //获取最后1个索引
        System.out.println(str1.lastIndexOf("羊")); //0

        //字符串转化
        /*
        string(char[] value)
        string(char[] value,int offset,int count,offset)
        static(char[] valueof(char[] data))
        static(char[] valueof(char[],int offset,int count,offset))
        string(char[] tocharArray)
         */
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        String str = new String(arr);
        System.out.println(str); //abcde

        String s1 = new String(arr, 2, 2);
        System.out.println(s1); //cd

        String s = String.valueOf(arr);
        System.out.println(s1);

        //replace
        System.out.println("abcde".replace('a', 'A'));

        //分割
        String lrc = "[01:00.20]这是一个test";
        String[] strs = lrc.split("]");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        //再次切割
        String[] str5 = strs[0].split(":");
        for (int i = 0; i < str5.length; i++) {
            System.out.println(str5[i]);
        }
        int ms = (int) (Float.valueOf(str5[1]) * 1000);
        System.out.println(ms);

        ms += Integer.valueOf(str5[0].substring(1)) * 60 * 1000;
        System.out.println(ms);

        //substring 左闭右开    ·
        System.out.println("0123456789".substring(0, 6));//012345
    }
}
