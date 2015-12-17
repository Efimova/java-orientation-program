package com.epam.efimova;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("Rubber Duck display");
    }

    @Override
    public void fly() {
        
    }

    @Override
    public void quack() {
        System.out.println("Rubber Duck quacking");
    }
}
