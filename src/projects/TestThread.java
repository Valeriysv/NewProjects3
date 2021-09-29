package projects;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class PrintDemo {
    ReentrantLock lock = new ReentrantLock();
    public void printCount() {
        lock.lock();
        try {
            System.out.println("На причале началась разгрузка, причал занят");
            Thread.sleep(5000);
            System.out.println("На причале закончилась погрузка, причал освобождается");
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Поток прерван.");
        } finally {
            lock.unlock();
        }
    }
}

class ThreadDemo extends Thread {
    ReentrantLock lock = new ReentrantLock();
    private Thread t;
    private String threadName;
    PrintDemo  PD;

    ThreadDemo( String name,  PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
              lock.lock();
            PD.printCount();
              lock.unlock();
        System.out.println(threadName + " уходит из порта");
    }

    public void start () {
        System.out.println("Приходит в порт " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class TestThread {

    public static void main(String args[]) {
        PrintDemo PD = new PrintDemo();
        ThreadDemo T1 = new ThreadDemo( "Корабль 1", PD );
        ThreadDemo T2 = new ThreadDemo( "Корабль 2", PD );
        T1.start();
        T2.start();
        // ждем, пока потоки завершатся
        try {
            T1.join();
            T2.join();
        } catch ( Exception e) {
            System.out.println("Прерван");
        }
    }
}