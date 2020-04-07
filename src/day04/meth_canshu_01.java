package day04;

class test {
    int num;
    int m;
    int n;
}

public class meth_canshu_01 {
    public static void main(String[] args) {
        test t1 = new test();
        t1.num = 100;

        test t2 = t1;//地址一样，都指向堆空间的同一个对象
        t2.num = 200;
        System.out.println(t1.num + "," + t2.num);

        meth_canshu_01 s = new meth_canshu_01();
//        int m = 10;
//        int n = 20;
//        //基本数据类型是值传递
//        s.swap(10, 20);
//        System.out.println(m + " ," + n);


        t1.m = 10;
        t1.n = 20;
        s.swap2(t2);//交换的是类对象
        System.out.println(t1.m + " ," + t1.n);

    }

    public void swap(int m, int n) {
        int tmp = m;
        m = n;
        n = tmp;
    }

    public void swap2(test t) {
        int tmp = t.m;
        t.m = t.n;
        t.n = tmp;
    }


}
