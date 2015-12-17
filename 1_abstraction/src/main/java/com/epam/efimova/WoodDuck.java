package com.epam.efimova;

/**
 * Created by Anna_Efimova on 12/15/2015.
 */
public class WoodDuck extends Duck {

    @Override
    void display() {
        System.out.println("Show wood duck");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void quack() {
        throw new UnsupportedOperationException();
    }
}
