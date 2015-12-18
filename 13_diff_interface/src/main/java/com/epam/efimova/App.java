package com.epam.efimova;

/**
 * 1) Определяя два Итерфейса с одинаковым методом и создав объект тип RootInterface,
 * то method будет переопреден интерфейса последнего в объявлении наследования
 * <p/>
 * Пример: public interface RootInterface extends  MyFirstInterface, MySecondInterface {}
 * method переопределен итерфейса MySecondInterface
 * <p/>
 * 2)если создавать явно инстанс типа MyFirstInterface,
 * то method() будет считаться переопреленным для этого класса
 *
 * To Recap
 */
public class App {
    public static void main(String[] args) {
        RootInterface app = new RootInterface() {
            @Override
            public void method() {
                System.out.println("Executing RootInterface");
            }

            @Override
            public void method1() {
                System.out.println("Executing MyFirstInterface");
            }
        };
        app.method();

        ((MyFirstInterface)app).method();
        ((MySecondInterface)app).method();

        MyFirstInterface firstInterface =  app;
        firstInterface.method();
        firstInterface.method1();

        MySecondInterface secondInterface =  app;
        secondInterface.method();
    }


}
