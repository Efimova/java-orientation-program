package com.epam.efimova.basic;

/**
 * Created by Anna_Efimova on 12/2/2015.
 */
public enum MyEnum {
    ONE, TWO;
    public static MyEnum instance;



    class MyInnerClass {

    }

    static class MyStaticClass {

    }

    void m1() {
        class myLocal {
        }
    }

    static void m2() {
        class myLocal {
        }
    }

    {
        class myLocal {
        }
    }

    static {
        class myLocal {
        }
    }

    IMyInter i = new IMyInter() {
        @Override
        public void myMethod3() {

        }
    };

}
