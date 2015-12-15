package com.epam.efimova.basic;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public class TestMain {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1();
        System.out.println("Class CL " + Class.class.getClassLoader());
        try {
            Class aClass = Class.forName("com.epam.test.classloader.Test");
            System.out.println(aClass.newInstance().getClass().getClassLoader());
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
