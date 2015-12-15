package com.epam.efimova;

/**
 * Created by Anna_Efimova on 12/9/2015.
 */
public class Test {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Invoke finalize method of Test class");
    }
}
