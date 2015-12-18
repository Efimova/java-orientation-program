package com.epam.efimova;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public abstract class Duck {
    IFlyable flyable;
    IQuackable quackable;


    abstract void display();

    public void peformQuack() {
        quackable.quack();
    }

    public void peformFly() {
        flyable.fly();
    }


}
