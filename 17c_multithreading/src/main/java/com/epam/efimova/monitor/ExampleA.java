package com.epam.efimova.monitor;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Anna_Efimova on 12/15/2015.
 */
public class ExampleA {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();
    }

}

class CounterThread extends Thread {

    protected Counter counter = null;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            counter.add(i);
        }
    }
}

class Counter {
    static Integer i = 0;
    Long count = 0l;

//    The synchronized keyword can be used to mark four different types of blocks:
//
//    Instance methods
//    Static methods
//    Code blocks inside instance methods
//    Code blocks inside static methods
    /*
    //
    public synchronized void add(long value) {
        this.count += value;
    } */
    /* public void add(long value) {
        synchronized (this) {
            this.count += value;
        }
    }*/
    public void add(long value) {
        synchronized (count) {
            this.count += value;
        }

    }

    public void modifyCount(long value) {
        synchronized (count) {
            this.count += value;
        }
    }

    static void modifyI() {
        synchronized (Counter.class) {
            i = 10;
        }
    }

}