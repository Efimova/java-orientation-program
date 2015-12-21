package com.epam.efimova.basic;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.TreeMap;

public class Outer extends Boo implements Serializable {
    public String STR1 = "str1";
    public static String STR2 = "str2";
    public final static String STR3 = "str3";
    public final String STR5 = "str5";
    private final String STR4 = "str4";

    public Outer(String s) {
        super(s);
    }


    static class Static {
        //Только статические переменные и методы класса Outer, STR3 и STR2
        void m() {
            //only static method
            metod1();
            //only static var
            System.out.println(Static.class.getName() + ": final static STR3 = " + STR3);
        }
    }

    void methodnew() {
        Object o = method();

        //    System.out.println(Class.forName("com.epam.efimova.basic.Outer$1LocalNested").newInstance() );
        Constructor<?> constructor = o.getClass().getDeclaredConstructors()[0];
        System.out.println("CONSTRUCTOR" + constructor.getName());
        try {
            System.out.println(constructor.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //(cl)o;


    }

    private class Inner {
        private String s = "str private ";

        //любые переменные, даже private
        void m() {
            //  System.out.println(this);
            //static
            metod1();
            //non static
            Object o = method();
            try {
                //    System.out.println(Class.forName("com.epam.efimova.basic.Outer$1LocalNested").newInstance() );
                Class.forName("com.epam.efimova.basic.Outer$1LocalNested").getDeclaredConstructor().newInstance();
                //(cl)o;

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            System.out.println(o.getClass());
            //static var
            System.out.println(STR3);
        }

    }

    static void metod1() {
        System.out.println("Outer static method1");
    }

    void metod2() {
        (new Inner()).s = "s";
        System.out.println("Outer method2" + (new Inner()).s);
    }

    Object method() {
        final Integer i1 = 0;
        Integer i2 = 1;

        class LocalNested {
            //   //скомпилится, и если вывести значение этой переменной в метоже m() выведится значение 5
            //   private Integer i1 = 5;
            LocalNested() {
                System.out.println("LOCAL NESTED CONSTRUCTOR");
            }

            void m(Integer i1) {
                Integer i = 4;
                System.out.println(LocalNested.class.getName() + ": public String STR1  = " + STR1);
                System.out.println(LocalNested.class.getName() + ": static String STR2  = " + STR2);
                System.out.println(LocalNested.class.getName() + ": final static String STR3 = " + STR3);
                System.out.println(LocalNested.class.getName() + ": private final String STR4 = " + STR4);
                System.out.println("Integer i2 = " + i2);
                System.out.println("Integer i1 = " + i1);

            }
        }

        LocalNested localNested = new LocalNested();
        localNested.m(1);
        return localNested;
    }

    public static void main(String[] args) {

       // Outer.Static aStatic = new Outer.Static();
//        aStatic.m();
//        Outer outer = new Outer();
//        Outer.Inner aInner = Outer.Inner;
//        outer.methodnew();
//        IMyInter iMyInter = new IMyInter() {
//            @Override
//            public void myMethod2() {
//
//            }
//
//            @Override
//            public void myMethod3() {
//
//            }
//        };
//        IMyInter.MyClass myClass = new IMyInter.MyClass();
//        MyEnum.MyStaticClass myEnum = new MyEnum.MyStaticClass();
        System.out.println();

    }

}

