package com.epam.efimova.basic;

public class A {
    static {
        i = 1;
    }

    {
        i = 2;
    }

    static int i = 3;

    static {
        i = 4;
    }

    {
        i = 5;
    }

    static {
        i = 6;
    }
}
