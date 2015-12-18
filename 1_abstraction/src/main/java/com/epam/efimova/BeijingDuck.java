package com.epam.efimova;

/**
 * Created by Anna_Efimova on 12/15/2015.
 */
public class BeijingDuck extends Duck {
    public BeijingDuck() {
        quackable = new Quack();
        flyable = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("Beijing Duck is appearing");
    }


}
