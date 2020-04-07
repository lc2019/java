package day03;

public class fuxi01 {
    public static void main(String[] args) {
        String str = "hello java";
        fuxi01 fuxi01 = new fuxi01();
        String trs = fuxi01.change(str);

        //不可变的数据类型
        System.out.println(str); //hello java
        System.out.println(trs); //hi
    }

    public String change(String s) {
        s = "hi你好";
        return s;
    }
}
