package com.epam.efimova.basic;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public class Test1 {

    void method(A a) {
        System.out.println(a.getClass());

    }

    void m1(){
        method(new A());
    }
}
class AA {
    // If the SecurityManager is not turned on, a
    // java.lang.ExceptionInInitializerError will be thrown
    static {
        if(System.getSecurityManager() == null)
            throw new SecurityException();
    }
}