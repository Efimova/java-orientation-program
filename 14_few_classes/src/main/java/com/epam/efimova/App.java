package com.epam.efimova;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Outer outer = new ChildOuter();
        outer.new Inner().m();

    }
}
