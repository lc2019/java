package TestDemo;

////
//////class Test implements Runnable {
//////    public static void main (String[] args) {
//////        Thread t = new Thread(new Test() );
//////        t.start();
//////    }
//////    public void run(int num) {
//////        for (int i =0; i < num; i++) {
//////            System.out.println( i );
//////        }
//////    }
//////
//////    @Override
//////    public void run() {
//////
//////    }
//////}
class Test extends Thread {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        System.out.println("1");
        yield();
        System.out.println("2");
    }
}
////class Test {
////    public static void main (String[] args) {
////        Thread t = new MyThread();
////        t.displayOutput("t has ben created");
////        t.start();
////    }
////}
////class MyThread extends Thread {
////    @Override
////    public void run() {
////        displayOutput("t is run");
////    }
////    public void displayOutput(String s){
////        System.out.println(s);
////    }
////}
//class Test {
//    public static void main (String[] args) {
//        MyThread t1 = new MyThread("t1");
//        MyThread t2 = new MyThread("t2");
//        t1.start();
//        t2.start();
//    }
//}
//class MyThread extends Thread {
//    public MyThread (String s) {
//        super( s );
//    }
//    @Override
//    public void run() {
//        for (int i =0; i<10; i++) {
//            try {
//                sleep( 1000 );
//            } catch (Exception e) { }
//            System.out.println( getName() );
//        }
//    }
//}