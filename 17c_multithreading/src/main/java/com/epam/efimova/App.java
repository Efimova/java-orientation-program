package com.epam.efimova;

import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        MyThread mt1 = new MyThread("MyThread-1");
        MyThread mt2 = new MyThread("MyThread-2");
        mt1.setPriority(2);
        mt2.setPriority(10);

        mt1.start();
        mt2.start();

        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        Thread[] threadArray = threadSet.toArray(new Thread[threadSet.size()]);


        //System.out.println(Thread.currentThread().isAlive() + " " + Thread.currentThread().getState() + " " + Thread.currentThread().getName());

//        for (Thread thread : threadArray) {
//            System.out.println("\n" + thread.getPriority() + "\n" + thread.getName() + "\n" + thread.getState() + "\n" + thread.isAlive());
//        }

        try {
            System.out.println(Thread.currentThread().isAlive() + " " + Thread.currentThread().getState() + " " + Thread.currentThread().getName());
            mt1.join();
            System.out.println(Thread.currentThread().isAlive() + " " + Thread.currentThread().getState() + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pi " + mt1.pi + "\ngetPriority " + mt1.getPriority() + "\nisAlive " + mt1.isAlive() + "\ngetState " + mt1.getState() + "\ngetName " + mt1.getName() + "\ngetThreadGroup " + mt1.getThreadGroup() + "\ngetId " + mt1.getId());

    }
}

class MyThread extends Thread {

    boolean negative = true;
    double pi;

    public MyThread(String myThread) {
        super(myThread);
    }

    @Override
    public void run() {

        for (int i = 3; i < 100000; i += 2) {

            if (negative) {

                pi -= (1.0 / i);
            } else {

                pi += (1.0 / i);
            }
            negative = !negative;
        }
        System.out.println(Thread.currentThread().isAlive() + " " + Thread.currentThread().getState() + " " + Thread.currentThread().getName());
        pi += 1.0;
        pi *= 4.0;
        System.out.println("Finished calculating PI");
    }
}