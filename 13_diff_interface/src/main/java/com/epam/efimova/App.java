package com.epam.efimova;

/**
 * Hello world!
 */
public class App implements MyFirstInterface, MySecondInterface {
    public static void main(String[] args) {
        MyFirstInterface app = new App();
        app.m();
    }

    @Override
    public void m() {
        System.out.println("MyInterface");
    }

    @Override
    public void m(int i) {

    }


}
