package com.epam.efimova.processor_intansive_thread;

/**
 * Created by Anna_Efimova on 12/11/2015.
 */

class SchedDemo {
    public static void main(String[] args) {
        new CalcThread("CalcThread A").start();
        new CalcThread("CalcThread B").start();
    }
}

class CalcThread extends Thread {
    CalcThread(String name) {
        super(name);
    }

    double calcPI() {
        boolean negative = true;
        double pi = 0.0;
        for (int i = 3; i < 100000; i += 2) {
            if (negative)
                pi -= (1.0 / i);
            else
                pi += (1.0 / i);
            negative = !negative;
        }
        pi += 1.0;
        pi *= 4.0;
        return pi;
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(i+" "+getName() + ": " + calcPI());
    }
}

