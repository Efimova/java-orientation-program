package com.epam.efimova;

/**
 * Created by Anna_Efimova on 12/15/2015.
 */
public class BeijingDuck extends Duck {
    @Override
    void display() {
        System.out.println("Beijing Duck is appearing");
    }

    @Override
    public void fly() {
        System.out.println("Beijing Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Beijing Duck is quacking");
    }
}
