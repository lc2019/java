package day05.quanxianxiushifu;

//final关键字
//修饰的引用类型 地址不能变
class testType {
    //final修饰的变量必须初始化
    final int Num = 10;
}

public class mxdx_final_04 {
    public static void main(String[] args) {
        final int Num = 20;
        //Num = 10; 一旦被赋值不能再次被修改
        System.out.println(Num);
    }
}
