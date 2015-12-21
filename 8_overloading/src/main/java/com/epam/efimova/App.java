package com.epam.efimova;

/**
 * Hello world!
 */
public class App {

//    void m(int i) {
//        System.out.println("int i = " + i);
//    }

//    void m(Integer i) {
//        System.out.println("Integer i = " + i);
//    }

//    void m(long i) {
//        System.out.println("long i = " + i);
//    }

    void m(Long i) {
        System.out.println("Long i = " + i);
    }

    void m(short i) {
        System.out.println("short i = " + i);
    }

    void m(Short i) {
        System.out.println("Short i = " + i);
    }

    void m(Object i) {
        System.out.println("Object i = " + i);
    }

    public static void main(String[] args) {
        App app = new App();
        int i = 10000000;
        app.m((short)i);
    }
}
