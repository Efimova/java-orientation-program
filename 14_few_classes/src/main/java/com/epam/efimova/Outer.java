package com.epam.efimova;

/**
 * Created by Anna_Efimova on 12/4/2015.
 */
public class Outer {
    class Inner{
        void m(){
            System.out.println("Outer.Inner");
        }
    }
}

class ChildOuter extends Outer {

    class Inner{
        void m(){
            System.out.println("ChildOuter.Inner");
        }
    }
}

