package com.epam.efimova.basic;

/**
 * Created by Anna_Efimova on 12/4/2015.
 */
public class Outer2 {
    class Inner{
        void m(){
            System.out.println("Outer2.Inner");
        }
    }
}
class ChildOuter2 extends Outer2{

    class Inner{

        void m(){
            System.out.println("Outer2.Inner");
        }
    }
}

