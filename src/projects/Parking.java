package projects;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Parking {

    public static void main(String[] args) throws InterruptedException {
        CarCounter carCounter = new CarCounter();
        for(int i=0; i<5; i++) {   // кол-во машин
            CounterThread ct = new CounterThread(carCounter);
            ct.start();
            Thread.sleep(5000);
        }
    }
}

class CarCounter
{
    ReentrantLock lock = new ReentrantLock();
    private int carCounter = 4; //кол-во мест

    public void carCounter() {
        lock.lock();
        carCounter--;
       lock.unlock();
    }

    public long getCounter() {
        return carCounter;
    }
}

class CounterThread extends Thread
{
    private CarCounter carCounter;

    public CounterThread(CarCounter carCounter) {
        this.carCounter = carCounter;
    }

    @Override
    public void run() {
      //  for(int i=0; i<5; i++) {
            carCounter.carCounter();
            if(carCounter.getCounter()>=0) {
                System.out.println("Машина припарковалась, осталось свободных мест " + carCounter.getCounter());
            } else {
                try {
                    Thread.sleep(6000);
                    System.out.println("Мест нет, машина уехала");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

   }



