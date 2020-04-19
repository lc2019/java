package day10.chengyuanfangfa;

public class test {
    /**
     * 新建一个接口-抽象方法
     */
    public static void main(String[] args) {
        //1.
//        usesubstr((String s,int x,int y) ->{
//            return  s.substring(x,y);
//        });
        //2lambda表达式
        usesubstr((s, x, y) -> s.substring(x, y));
        //3lamabda引用方法 s x,y传递给substring -类的实例方法
        usesubstr(String::substring);

    }

    public static void usesubstr(itr i) {
        String s = i.substr("hello java", 2, 5);
        System.out.println(s);
    }
}
