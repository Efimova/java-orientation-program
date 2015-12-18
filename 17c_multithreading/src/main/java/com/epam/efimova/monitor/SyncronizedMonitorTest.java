package com.epam.efimova.monitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anna_Efimova on 12/14/2015.
 */
public class SyncronizedMonitorTest {


    public static void main(String[] args) {
        TestB testB = new TestB(new TestA());
        ThreadTest threadTest = new ThreadTest(testB);
        Thread t1 = new Thread(threadTest);
        Thread t2 = new Thread(threadTest);
        t1.start();
        t2.start();
    }
}

class ThreadTest implements Runnable {
    TestB testB = null;

    ThreadTest(TestB testB) {
        this.testB = testB;
    }

    @Override
    public void run() {
        testB.mTest();

    }
}

class TestA {
    private List list = new ArrayList<>();

    public List getList() {
        return list;
    }

    void mTestA() {

    }

}

class TestB {
    TestA testA = null;

    TestB(TestA testA) {
        this.testA = testA;
    }

    void mTest() {
        int i = 0;
        synchronized (testA) {
            testA.getList().add("any" + ++i);
        }
        for (int j = 0; j < testA.getList().size(); j++)
            System.out.print(testA.getList().get(j)+ " ");
        System.out.println();
    }
}