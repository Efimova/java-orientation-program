package com.epam.efimova.wait_notify_notifyall;

/**
 * Created by Anna_Efimova on 12/14/2015.
 */
public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        Thread t1 = new Thread(waiter, "waiter");
        t1.start();
        t1.interrupt();

        Waiter waiter1 = new Waiter(msg);
        Thread t2 = new Thread(waiter1, "waiter1");
        t2.start();
        t1.interrupt();
        Notifier notifier = new Notifier(msg);
        Thread t3 = new Thread(notifier, "notifier");
        t3.start();
        System.out.println("All the threads are started");
    }

}

class Notifier implements Runnable {

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name + " Notifier work done");

                   msg.notify();
                //    msg.notify();
                //.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class Waiter implements Runnable {

    private Message msg;

    public Waiter(Message m) {
        this.msg = m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try {
                System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
                msg.wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+ " InterruptedException.... ");
               // e.printStackTrace();
            }
            System.out.println(name + " waiter thread got notified at time:" + System.currentTimeMillis());
            //process the message now
            System.out.println(name + " processed: " + msg.getMsg());
        }
    }
}

class Message {
    private String msg;

    public Message(String str) {
        this.msg = str;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

}