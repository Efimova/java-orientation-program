package com.epam.efimova.basic;

/**
 * Created by Anna_Efimova on 11/30/2015.
 */
public abstract interface  IMyInter {
    final static String s1 = "s";

    String toString();

    static void myMethod1() {
        class Localclass {

        }
    }

    default void myMethod2() {
        String s = "123";

        class Localclass {
            {
                System.out.println(s1);
            }
        }
    }

    void myMethod3();

    Foo foo = new Foo() {
    };

    // public static class
    class MyClass {
        Integer i = 1;

        {
            myMethod1();
            i = 7;
        }
    }
}

