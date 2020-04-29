package day17.线程通信.并发;

import java.util.concurrent.CountDownLatch;

/**
 * 允许1个或多个线程等待其他线程完成操作，在执行自己
 * 线程1 打印ac
 * 线程2 打印b
 * <p>
 * 允许一个或多个线程等待直到在其他线程中执行的一组操作完成的同步辅助。
 * A CountDownLatch用给定的计数初始化。 await方法阻塞，直到由于countDown()方法的调用而导致当前计数达到零，之后所有等待线程被释放，
 * 并且任何后续的await 调用立即返回。 这是一个一次性的现象 - 计数无法重置。 如果您需要重置计数的版本，请考虑使用CyclicBarrier 。
 * <p>
 * A CountDownLatch是一种通用的同步工具，可用于多种用途。 一个CountDownLatch为一个计数的CountDownLatch用作一个简单的开/关锁存器，
 * 或者门：所有线程调用await在门口等待，直到被调用countDown()的线程打开。 一个CountDownLatch初始化N可以用来做一个线程等待，
 * 直到N个线程完成某项操作，或某些动作已经完成N次。
 * <p>
 * CountDownLatch一个有用的属性是，它不要求调用countDown线程等待计数到达零之前继续，它只是阻止任何线程通过await ，
 * 直到所有线程可以通过。
 * <p>
 * 示例用法：这是一组类，其中一组工作线程使用两个倒计时锁存器：
 * <p>
 * 第一个是启动信号，防止任何工作人员进入，直到驾驶员准备好继续前进;
 * 第二个是完成信号，允许司机等到所有的工作人员完成。
 * class Driver { // ... void main() throws InterruptedException {
 * CountDownLatch startSignal = new CountDownLatch(1); CountDownLatch doneSignal = new CountDownLatch(N);
 * for (int i = 0; i < N; ++i) // create and start threads new Thread(new Worker(startSignal, doneSignal)).start();
 * doSomethingElse(); // don't let run yet startSignal.countDown(); // let all threads proceed doSomethingElse();
 * doneSignal.await(); // wait for all to finish } } class Worker implements Runnable {
 * private final CountDownLatch startSignal; private final CountDownLatch doneSignal;
 * Worker(CountDownLatch startSignal, CountDownLatch doneSignal) { this.startSignal = startSignal;
 * this.doneSignal = doneSignal; } public void run() { try { startSignal.await();
 * doWork();
 * doneSignal.countDown(); } catch (InterruptedException ex) {} // return; } void doWork() { ... } }
 * 另一个典型的用法是将问题划分为N个部分，用一个Runnable来描述每个部分，该Runnable执行该部分并在锁存器上倒计时，
 * 并将所有Runnables排队到执行器。 当所有子部分完成时，协调线程将能够通过等待。 （当线程必须以这种方式反复倒数时，
 * 请改用CyclicBarrier ））
 * <p>
 * class Driver2 { // ... void main() throws InterruptedException {
 * CountDownLatch doneSignal = new CountDownLatch(N);
 * Executor e = ... for (int i = 0; i < N; ++i) // create and start threads e.execute(new WorkerRunnable(doneSignal, i));
 * doneSignal.await(); // wait for all to finish } } class WorkerRunnable implements Runnable {
 * private final CountDownLatch doneSignal; private final int i; WorkerRunnable(CountDownLatch doneSignal, int i) {
 * this.doneSignal = doneSignal; this.i = i; } public void run() { try { doWork(i); doneSignal.countDown(); }
 * catch (InterruptedException ex) {} // return; } void doWork() { ... } } 内存一致性效果：直到计数调用之前达到零，
 * 在一个线程操作countDown() happen-before以下由相应的成功返回行动await()在另一个线程
 */
public class Condownlatch {
    public static void main(String[] args) {
        //创建Condownlatch对象 用于监督A，B线程
        CountDownLatch c = new CountDownLatch(1);
        new ThreadA(c).start();
        new ThreadB(c).start();


    }
}

class ThreadA extends Thread {
    private CountDownLatch c;

    public ThreadA(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println('A');
        try {
            //等待自己根据监督者中的数量决定当前线程让出cpu等待自己，返回bool值
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println('C');
    }
}

class ThreadB extends Thread {
    private CountDownLatch c;

    public ThreadB(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println('B');
        //计数器-1
        c.countDown();
    }
}